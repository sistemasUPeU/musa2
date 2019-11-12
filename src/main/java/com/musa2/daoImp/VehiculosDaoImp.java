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
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_VEHICULOS").withProcedureName("PR_CREAR_VEHICULOS")
				.declareParameters(new SqlParameter("P_NROPADRON", Types.INTEGER ),
						           new SqlParameter("P_ESTADO", Types.INTEGER),
						           new SqlParameter("P_PLACA", Types.VARCHAR),
						           new SqlParameter("P_MOTOR", Types.VARCHAR),
						           new SqlParameter("P_SERIE", Types.INTEGER),
						           new SqlParameter("P_ANHOFABRICACION", Types.DATE),
						           new SqlParameter("P_PASAJEROSSENTADOS", Types.INTEGER),
						           new SqlParameter("P_PASAJEROSPIE", Types.INTEGER),
						           new SqlParameter("P_IDVEHMODELO", Types.INTEGER),
						           new SqlParameter("P_IDVEHMARCA", Types.INTEGER),
						           new SqlParameter("P_IDVEHCATEGORIA", Types.INTEGER),
						           new SqlParameter("P_USO", Types.VARCHAR),
						           new SqlParameter("P_USERCREATE", Types.VARCHAR),
						           new SqlParameter("P_DATECREATE", Types.DATE),
						           new SqlParameter("P_USERMODIFY", Types.VARCHAR),
						           new SqlParameter("P_DATEMODIFY", Types.DATE));
		
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_NROPADRON", ve.getNropadron())
				                                           .addValue("P_ESTADO", ve.getEstado())
				                                           .addValue("P_PLACA", ve.getPlaca())
				                                           .addValue("P_MOTOR", ve.getMotor())
				                                           .addValue("P_SERIE", ve.getSerie())
				                                           .addValue("P_ANHOFABRICACION", ve.getAnhofabricacion())
				                                           .addValue("P_PASAJEROSENTADOS", ve.getPasajerossentados())
				                                           .addValue("P_PASAJEROSPIE", ve.getPasajerospie())
				                                           .addValue("P_IDVEHMODELO", ve.getIdvehiculo())
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
	public Map<String, Object> search(int nropadron) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_VEHICULOS").withProcedureName("PR_BUSCAR_VEHICULO")
				.declareParameters(new SqlOutParameter("P_CURSOR",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_NROPADRON", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_NROPADRON", nropadron);
		return simpleJdbcCall.execute(in);

	}
  	
  	
}
