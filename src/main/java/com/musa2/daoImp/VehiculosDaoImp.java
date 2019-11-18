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

import com.musa2.dao.VehiculosDao;
import com.musa2.entity.Vehiculos;

import aj.org.objectweb.asm.Type;
import oracle.jdbc.internal.OracleTypes;

@Repository
public class VehiculosDaoImp implements VehiculosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
  	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public Map<String, Object> create(Vehiculos ve){
		// TODO Auto-generated method stub
		System.out.println("enviado");
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_VEHICULOS").withProcedureName("pr_crear_vehiculos")
				.declareParameters(new SqlParameter("p_nropadron", Types.INTEGER ),
						           new SqlParameter("p_estado", Types.INTEGER),
						           new SqlParameter("p_placa", Types.VARCHAR),
						           new SqlParameter("p_motor", Types.VARCHAR),
						           new SqlParameter("p_serie", Types.INTEGER),
						           new SqlParameter("p_anhofrabricacion", Types.DATE),
						           new SqlParameter("p_pasajerossentados", Types.INTEGER),
						           new SqlParameter("p_pasajerospie", Types.INTEGER),
						           new SqlParameter("p_idvehmodelo", Types.INTEGER),
						           new SqlParameter("p_idvehmarca", Types.INTEGER),
						           new SqlParameter("p_idvehcategoria", Types.INTEGER),
						           new SqlParameter("p_uso", Types.VARCHAR),
						           new SqlParameter("p_usercreate", Types.VARCHAR),
						           new SqlParameter("p_datecreate", Types.DATE),
						           new SqlParameter("p_usermodify", Types.VARCHAR),
						           new SqlParameter("p_datemodify", Types.DATE));
		
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_nropadron", ve.getNropadron())
				                                           .addValue("p_estado", ve.getEstado())
				                                           .addValue("p_placa", ve.getPlaca())
				                                           .addValue("p_motor", ve.getMotor())
				                                           .addValue("p_serie", ve.getSerie())
				                                           .addValue("p_anhofrabricacion", ve.getAnhofabricacion())
				                                           .addValue("p_pasajerossentados", ve.getPasajerossentados())
				                                           .addValue("p_pasajerospie", ve.getPasajerospie())
				                                           .addValue("p_idvehmodelo", ve.getIdvehmodelo())
				                                           .addValue("p_idvehmarca", ve.getIdvehmarca())
				                                           .addValue("p_idvehcategoria", ve.getIdvehcategoria())
				                                           .addValue("p_uso", ve.getUso())
				                                           .addValue("p_usercreate", ve.getUsercreate())
				                                           .addValue("p_datecreate", ve.getDatecreate())
				                                           .addValue("p_usermodify", ve.getUsermodify())
				                                           .addValue("p_datemodify", ve.getDatemodify());
				
	   return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> update(Vehiculos ve){
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_PROPIETARIOS").withProcedureName("PR_ACTUALIZAR_VEHICULOS")
				.declareParameters(new SqlParameter("P_VEHICULO_ID", Types.INTEGER),
						           new SqlParameter("P_NROPADRON", Types.INTEGER),
						           new SqlParameter("P_ESTADO", Types.INTEGER),
						           new SqlParameter("P_PLACA", Types.VARCHAR),
						           new SqlParameter("P_MOTOR", Types.VARCHAR),
						           new SqlParameter("P_SERIE", Types.INTEGER),
						           new SqlParameter("P_ANHOFABRICACION", Types.DATE),
						           new SqlParameter("P_PASAJEROSSENTADOS", Types.DATE),
						           new SqlParameter("P_PASAJEROSPIE", Types.DATE),
						           new SqlParameter("P_IDVEHMODELO", Types.INTEGER),
						           new SqlParameter("P_IDVEHMARCA", Types.INTEGER),
						           new SqlParameter("P_IDVEHCATEGORIA", Types.INTEGER),
						           new SqlParameter("P_USO", Types.VARCHAR),
						           new SqlParameter("P_USERCREATE", Types.VARCHAR),
						           new SqlParameter("P_DATECREATE", Types.DATE),
						           new SqlParameter("P_USERMODIFY", Types.VARCHAR),
						           new SqlParameter("P_DATEMODIFY",Types.VARCHAR ));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_VEHICULO_ID", ve.getIdvehiculo())
				                                            .addValue("P_NROPADRON", ve.getNropadron())
				                                            .addValue("P_ESTADO", ve.getEstado())
				                                            .addValue("P_PLACA", ve.getPlaca())
				                                            .addValue("P_MOTOR", ve.getMotor())
				                                            .addValue("P_SERIE", ve.getSerie())
				                                            .addValue("P_ANHOFABRICACION", ve.getAnhofabricacion())
				                                            .addValue("P_PASAJEROSSENTADOS", ve.getPasajerossentados())
				                                            .addValue("P_PASAJEROSPIE", ve.getPasajerospie())
				                                            .addValue("P_IDVEHMODELO", ve.getIdvehmodelo())
				                                            .addValue("P_IDVEHMARCA", ve.getIdvehmarca())
				                                            .addValue("P_IDVEHCATEGORIA", ve.getIdvehcategoria())
				                                            .addValue("P_USO", ve.getUso())
				                                            .addValue("P_USERCREATE", ve.getUsercreate())
				                                            .addValue("P_DATECREATE", ve.getDatecreate())
				                                            .addValue("P_USERMODIFY", ve.getUsermodify())
				                                            .addValue("P_DATEMODIFY", ve.getDatemodify());
		return simpleJdbcCall.execute(in);
	}
	@Override
	public int delete(int id) {
		return jdbcTemplate.update("call PKG_CV_CRUD_VEHICULOS.PR_ELIMINAR_VEHICULOS(?)", id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_VEHICULOS_ID").withCatalogName("PKG_CV_CRUD_VEHICULOS")
				.declareParameters(new SqlOutParameter("vehi",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_IDPROPIETARIO", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDVEHICULO", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_VEHICULOS")
				.withCatalogName("PKG_CV_CRUD_VEHICULOS")
				.declareParameters(new SqlOutParameter("vehi", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> readplaca() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_VEHICULOS")
				.withProcedureName("PR_LISTAR_NOMBRE")
				.declareParameters(new SqlOutParameter("con", OracleTypes
				.CURSOR,new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	public Map<String, Object> search(int nropadron) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_VEHICULOS").withProcedureName("PR_BUSCAR_VEHICULO")
				.declareParameters(new SqlOutParameter("P_CURSOR",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_NROPADRON", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_NROPADRON", nropadron);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readmodelId() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_MODELO_ID")
				.withCatalogName("PKG_CV_CRUD_VEHICULOS")
				.declareParameters(new SqlOutParameter("P_CUR_MODELO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> readmarcaId() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_MARCA_ID")
				.withCatalogName("PKG_CV_CRUD_VEHICULOS")
				.declareParameters(new SqlOutParameter("P_CUR_MARCA_ID", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> readcatId() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_CATEGORIA_ID")
				.withCatalogName("PKG_CV_CRUD_VEHICULOS")
				.declareParameters(new SqlOutParameter("P_CUR_CATEGORIA", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
  	
  	
}
