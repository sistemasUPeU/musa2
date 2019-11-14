package com.musa2.daoImp;

import java.sql.Types;
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

import com.musa2.dao.PropietariosDao;
import com.musa2.entity.Propietarios;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class PropietariosDaoImp implements PropietariosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public Map<String, Object> create(Propietarios pro) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_PROPIETARIOS").withProcedureName("pr_crear_propietario")
				.declareParameters(new SqlParameter("p_tipopropietario",Types.INTEGER),
						           new SqlParameter("p_estado", Types.INTEGER),
						           new SqlParameter("p_idpersona", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_tipopropietario", pro.getTipopropietario())
				                                           .addValue("p_estado", pro.getEstado())
				                                           .addValue("p_idpersona", pro.getIdpersona());
		return simpleJdbcCall.execute(in);
	}
	@Override
	public  Map<String, Object> update(Propietarios pro) {
		// TODO Auto-generated method stub	
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_PROPIETARIOS").withProcedureName("PR_ACTUALIZAR_PROPIETARIOS")
				.declareParameters(new SqlParameter("P_IDPROPIETARIO", Types.INTEGER),
						           new SqlParameter("P_TIPOPROPIETARIO", Types.INTEGER),
						           new SqlParameter("P_ESTADO", Types.INTEGER),
						           new SqlParameter("P_IDPERSONA", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDPROPIETARIO", pro.getIdpropietario())
				                                           .addValue("P_TIPOPROPIETARIO", pro.getTipopropietario())
				                                           .addValue("P_ESTADO", pro.getEstado())
				                                           .addValue("P_IDPERSONA", pro.getIdpersona());
		return simpleJdbcCall.execute(in);
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_PROPIETARIOS.PR_ELIMINAR_PROPIETARIOS(?)", id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_PROPIETARIOS_ID").withCatalogName("PKG_CV_CRUD_PROPIETARIOS")
				.declareParameters(new SqlOutParameter("pro",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_IDPROPIETARIO", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDPROPIETARIO", id);
		return  simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_PROPIETARIOS")
				.withCatalogName("PKG_CV_CRUD_PROPIETARIOS")
				.declareParameters(new SqlOutParameter("pro", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> readnom() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_PROPIETARIOS")
				.withProcedureName("PR_LISTAR_NOMBRE")
				.declareParameters(new SqlOutParameter("con", OracleTypes
				.CURSOR,new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
<<<<<<< HEAD
=======
	public Map<String, Object> search(String nombre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_PROPIETARIOS").withProcedureName("PR_LISTAR_BUSCAR_PROPIETARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_NOMBRE", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_NOMBRE", nombre);  
		return  simpleJdbcCall.execute(in);
	}
>>>>>>> 13551fd04dd5048e5e6a574dda893675f8575b84
	
	
}
