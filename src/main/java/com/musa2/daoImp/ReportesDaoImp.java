package com.musa2.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa2.dao.ReportesDao;

import oracle.jdbc.OracleTypes;
@Repository
public class ReportesDaoImp implements ReportesDao{
	@Autowired
	private JdbcTemplate JdbcTemplate;
	private SimpleJdbcCall SimpleJdbcCall;
	@Override
	public Map<String, Object> buses() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_REGISTRO_BUSES")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> usuaios() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_REGISTRO_USUARIOS")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> conductores() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_CONDUCTORES_REGISTRADOS")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();	}

	@Override
	public Map<String, Object> opro() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_OPCIONES_ROL")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();	}

	@Override
	public Map<String, Object> usro() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_USUARIOS_ROL")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();	}

	@Override
	public Map<String, Object> pedidosR() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_PEDIDOS_REGISTRADOS")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();	}

	@Override
	public Map<String, Object> pedidosE() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_ESTADO_PEDIDOS")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();	}

	@Override
	public Map<String, Object> pedidosA() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_PEDIDOS_APROVADOS")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();	}

	@Override
	public Map<String, Object> Vinculo() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_VINCULO_PROPI_BUS")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();	}

	@Override
	public Map<String, Object> Propietario() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_PROPIETARIOS_REGISTRADO")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();	}

	@Override
	public Map<String, Object> MantR() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_MANT_REGISTRADOS")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();	}

	@Override
	public Map<String, Object> MantV() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_MANT_VALIDADOS")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();	}

	@Override
	public Map<String, Object> RevisionesD() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_REP_MANT_REVISOINES_DIARIAS")
				.withCatalogName("PKG_REP_CRUD_REPORTES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();	}

}
