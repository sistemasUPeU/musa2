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

import com.musa2.dao.Configuraciones_GrupoDao;
import com.musa2.entity.Configuraciones_Grupo;

import oracle.jdbc.OracleTypes;
@Repository
public class Configuraciones_GrupoDaoImp implements Configuraciones_GrupoDao {
	@Autowired
	private JdbcTemplate JdbcTemplate;
	private SimpleJdbcCall SimpleJdbcCall;
	@Override
	public int create(Configuraciones_Grupo cg) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_CONFI_GRUPOS.PR_CREAR_CONFIG(?,?,?,?,?,?,?)", cg.getCantidadgrupos(), cg.getIntervalo(),cg.getHorainicio(), cg.getHorafin(), cg.getCantidadvehiculo(), cg.getIdparadero(), cg.getUsercreate());
	}

	@Override
	public int SaveUno(Configuraciones_Grupo cg) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_CONFI_GRUPOS.PR_UNO(?,?,?)",cg.getCantidadgrupos(), cg.getCantidadvehiculo(), cg.getUsermodify());
	}
	
	@Override
	public int SaveDos(Configuraciones_Grupo cg) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_CONFI_GRUPOS.PR_DOS(?,?,?)",cg.getCantidadgrupos(), cg.getCantidadvehiculo(), cg.getUsermodify());
	}

	@Override
	public Map<String, Object> readP(int paradero) {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_LISTAR_CONFIG_PARADERO").withCatalogName("PKG_CONFI_GRUPOS")
				.declareParameters(new SqlOutParameter("P_CURSOR",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_IDPARADERO", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDPARADERO", paradero);
		return SimpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readUNO() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_LISTAR_UNO")
				.withCatalogName("PKG_CONFI_GRUPOS")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readDOS() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_LISTAR_DOS")
				.withCatalogName("PKG_CONFI_GRUPOS")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();
	}

}
