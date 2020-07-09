package com.github.editor.controller;

import com.github.editor.handler.*;
import com.github.editor.internal.ConfigReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class SQLController {

	public static final ConfigReader configReader=ConfigReader.getInstance();

	@Autowired
	MySQLHandler mySQLHandler;

	@Autowired
	OracleHandler oracleHandler;

	@Autowired
	PostgreHandler postgreHandler;

	@Autowired
	HQLHandler hqlHandler;

	@Autowired
	SparkSQLHandler sparkSQLHandler;

	@Autowired
	FlinkSQLHandler flinkSQLHandler;

	@RequestMapping("/sql/mysql/")
	public @ResponseBody Object requestMySQL(
			@RequestParam String username,
			@RequestParam String url,
			@RequestParam String sql){

		return null;
	}

	@RequestMapping("/sql/oracle")
	public @ResponseBody Object requestOracle(
			@RequestParam String username,
			@RequestParam String url,
			@RequestParam String sql){
		return null;
	}

	@RequestMapping("/sql/postgre")
	public @ResponseBody Object requestPostgre(
			@RequestParam String username,
			@RequestParam String url,
			@RequestParam String sql){
		return null;
	}

	@RequestMapping("/sql/hivesql")
	public @ResponseBody Object requestHiveSQL(
			@RequestParam String username,
			@RequestParam String url,
			@RequestParam String sql){
		return null;
	}

	@RequestMapping("/sql/sparkSQL")
	public @ResponseBody Object requestSparkSQL(
			@RequestParam String username,
			@RequestParam String url,
			@RequestParam String sql){
		return null;
	}

	@RequestMapping("/sql/FlinkSQL")
	public @ResponseBody Object requestFlinkSQL(
			@RequestParam String username,
			@RequestParam String url,
			@RequestParam String sql){
		return null;
	}

}
