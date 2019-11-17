package com.musa2.daoImp;

import java.util.Date;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa2.dao.KardexDao;
import com.musa2.entity.Kardex;

import oracle.jdbc.OracleTypes;

@Repository
public class KardexDaoImp implements KardexDao{
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Kardex kar) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
		
		
		Kardex kar2=new Kardex();
		kar2.setTipomovimiento("1");
		kar2.setConcepto(1);
		kar2.setEstado(1);
		kar2.setFecha("2019-12-12");
		kar2.setNrocomprobante(123);
		kar2.setNroserie(123);
		
		
				                                                                           
		
		 return jdbcTemplate.update("call PKG_CRUD_KARDEX.PR_CREAR_KARDEX(?,?,?,?,?,?,?,?,?,?,?,?)",String.valueOf(kar.getTipomovimiento()),kar.getConcepto(),kar.getEstado(),kar.getFecha(),kar.getNrocomprobante(),kar.getNroserie(),kar.getUsercreate(),
				                                                                            kar.getDatecreate(),kar.getIdtipocomprobante(),kar.getIdempleado(),kar.getIdpedido(),kar.getError());
		 
	}

	@Override
	public int update(Kardex kar) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_KARDEX.PR_ACTUALIZAR_KARDEX(?,?,?,?,?,?,?,?,?,?,?,?)",kar.getIdkardex(),kar.getTipomovimiento(),kar.getConcepto(),kar.getEstado(),kar.getFecha(),kar.getNrocomprobante(),
				                                                                               kar.getNroserie(),kar.getUsermodify(),kar.getDatemodify(),kar.getIdtipocomprobante(),kar.getIdempleado(),kar.getIdpedido());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_KARDEX.PR_ELIMINAR_KARDEX(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_KARDEX_ID").withCatalogName("PKG_CRUD_KARDEX")
				.declareParameters(new SqlOutParameter("kard",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_IDKADEX", Types.INTEGER)); 
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDKARDEX", id);
		return  simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_KARDEX")
				.withCatalogName("PKG_CRUD_KARDEX")
				.declareParameters(new SqlOutParameter("kard",OracleTypes.CURSOR, new ColumnMapRowMapper()));
	return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> findKardexByComprobante(int nrocomprobante) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_BUSCAR_KARDEX")	
				.withCatalogName("PKG_CRUD_KARDEX")
				.declareParameters(new SqlOutParameter("kard", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_NROCOMPROBANTE",nrocomprobante );		
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> buscarKardexByIdKardexProducto(int idkardex) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LIST_PRODS_IDKARDEX")
				.withCatalogName("PKG_CRUD_KARDEX")
				.declareParameters(new SqlOutParameter("kard", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource().addValue("P_IDKARDEX", idkardex);
		//simpleJdbcCall.execute(sqlParameterSource);
		
		return simpleJdbcCall.execute(sqlParameterSource);
	}
}