package seo.report;

import java.util.*;

import seo.report.VP_RESULTS.Field;


/** Defines the columns that exist for the ADVHIST table <b>VP_RESULTS</b>.*/ 
public class VP_RESULTS implements Table{

	private VP_RESULTS(){
		super();
	}

	public static VP_RESULTS getTable(){
		return new VP_RESULTS();
	}

	private static final String tableName =" VP_RESULTS";

	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>ID<br><b>Column Type: </b>NUMERIC </pre>*/
	public static final String ID = Field.ID.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>TESTCASE<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String TESTCASE = Field.TESTCASE.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>ITERATION<br><b>Column Type: </b>NUMERIC </pre>*/
	public static final String ITERATION = Field.ITERATION.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>INTERNAL_ITERATION<br><b>Column Type: </b>NUMERIC </pre>*/
	public static final String INTERNAL_ITERATION = Field.INTERNAL_ITERATION.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>ENVIRONMENT<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String ENVIRONMENT = Field.ENVIRONMENT.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>DESCRIPTION<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String DESCRIPTION = Field.DESCRIPTION.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>TABLE_NAME<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String TABLE_NAME = Field.TABLE_NAME.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>FIELD_NAME<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String FIELD_NAME = Field.FIELD_NAME.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>EXPECTED<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String EXPECTED = Field.EXPECTED.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>ACTUAL<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String ACTUAL = Field.ACTUAL.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>IDENTIFIER1<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String IDENTIFIER1 = Field.IDENTIFIER1.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>IDENTIFIER2<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String IDENTIFIER2 = Field.IDENTIFIER2.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>IDENTIFIER3<br><b>Column Type: </b>NUMERIC </pre>*/
	public static final String IDENTIFIER3 = Field.IDENTIFIER3.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>STATUS<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String STATUS = Field.STATUS.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>DATE_TIME<br><b>Column Type: </b>DATE </pre>*/
	public static final String DATE_TIME = Field.DATE_TIME.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>TIMEZONE<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String TIMEZONE = Field.TIMEZONE.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>USER_NAME<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String USER_NAME = Field.USER_NAME.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>MACHINE_NAME<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String MACHINE_NAME = Field.MACHINE_NAME.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>MACHINE_IP<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String MACHINE_IP = Field.MACHINE_IP.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>RUN_NAME<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String RUN_NAME = Field.RUN_NAME.fieldName;
	/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>RUN_ID<br><b>Column Type: </b>VARCHAR </pre>*/
	public static final String RUN_ID = Field.RUN_ID.fieldName;
	/**
	 * Representation of the fields available in this table. The enumeration
	 * backs the front-facing set for this table class, and provides additional
	 * attributes where necessary.
	 */
	public enum Field implements TableColumn{
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>ID<br><b>Column Type: </b>NUMERIC </pre>*/
		ID("ID", "NUMERIC"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>TESTCASE<br><b>Column Type: </b>VARCHAR </pre>*/
		TESTCASE("TESTCASE", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>ITERATION<br><b>Column Type: </b>NUMERIC </pre>*/
		ITERATION("ITERATION", "NUMERIC"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>INTERNAL_ITERATION<br><b>Column Type: </b>NUMERIC </pre>*/
		INTERNAL_ITERATION("INTERNAL_ITERATION", "NUMERIC"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>ENVIRONMENT<br><b>Column Type: </b>VARCHAR </pre>*/
		ENVIRONMENT("ENVIRONMENT", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>DESCRIPTION<br><b>Column Type: </b>VARCHAR </pre>*/
		DESCRIPTION("DESCRIPTION", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>TABLE_NAME<br><b>Column Type: </b>VARCHAR </pre>*/
		TABLE_NAME("TABLE_NAME", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>FIELD_NAME<br><b>Column Type: </b>VARCHAR </pre>*/
		FIELD_NAME("FIELD_NAME", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>EXPECTED<br><b>Column Type: </b>VARCHAR </pre>*/
		EXPECTED("EXPECTED", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>ACTUAL<br><b>Column Type: </b>VARCHAR </pre>*/
		ACTUAL("ACTUAL", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>IDENTIFIER1<br><b>Column Type: </b>VARCHAR </pre>*/
		IDENTIFIER1("IDENTIFIER1", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>IDENTIFIER2<br><b>Column Type: </b>VARCHAR </pre>*/
		IDENTIFIER2("IDENTIFIER2", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>IDENTIFIER3<br><b>Column Type: </b>NUMERIC </pre>*/
		IDENTIFIER3("IDENTIFIER3", "NUMERIC"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>STATUS<br><b>Column Type: </b>VARCHAR </pre>*/
		STATUS("STATUS", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>DATE_TIME<br><b>Column Type: </b>DATE </pre>*/
		DATE_TIME("DATE_TIME", "DATE"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>TIMEZONE<br><b>Column Type: </b>VARCHAR </pre>*/
		TIMEZONE("TIMEZONE", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>USER_NAME<br><b>Column Type: </b>VARCHAR </pre>*/
		USER_NAME("USER_NAME", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>MACHINE_NAME<br><b>Column Type: </b>VARCHAR </pre>*/
		MACHINE_NAME("MACHINE_NAME", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>MACHINE_IP<br><b>Column Type: </b>VARCHAR </pre>*/
		MACHINE_IP("MACHINE_IP", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>RUN_NAME<br><b>Column Type: </b>VARCHAR </pre>*/
		RUN_NAME("RUN_NAME", "VARCHAR"),
		/** <pre>      <b>Table: </b>VP_RESULTS<br>     <b>Column: </b>RUN_ID<br><b>Column Type: </b>VARCHAR </pre>*/
		RUN_ID("RUN_ID", "VARCHAR");

		private String fieldName = "";

		private String type = null;

		private Field(String dbName){
			this.fieldName = dbName;
		}

		private Field(String dbName, String type){
			this.fieldName = dbName;
			this.type = type;
		}

		/**
		 * The assigned field/column name. Usually the same as the name of the 
		 * enumerated type (what can be derived from <code>toString()</code>), 
		 * but does not have to be.
		 */
		public String getDbName(){
			return this.fieldName;
		}
		/**
		 * The assigned field/column name. Usually the same as the name of the 
		 * enumerated type (what can be derived from <code>toString()</code>), 
		 * but does not have to be.
		 */
		public String getName(){
			return getDbName();
		}
		/**
		 * The assigned field type (String value)		 */
		public String getType(){
			return this.type;
		}
		
		/**
		 * Finds and returns the matching enumeration type for the given field name.
		 * If a name given does not find a match, <code><b>null</b></code> is returned.
		 * @param fieldName name of the field to match
		 * @return matching Field
		 */
		public static Field getFieldByName(String fieldName){
			if(fieldName != null){
				for(Field f : Field.values()){
					if(f.fieldName.equals(fieldName)){
						return f;
					}
				}
			}
			return null;
		}
		/**
		 * Returns a String list of the field names from this table. They are in order
		 * of the declared underlying enumeration (although this is not always guaranteed).
		 * @return list of the field names from this table
		 */
		public List<String> listFields(){
			List<String> fieldSet = new ArrayList<String>();
			for(Field f : Field.values()){
				fieldSet.add(f.fieldName);
			}
			return fieldSet;
		}
	}	@Override
	public String getTableName(){
		return tableName;
	}
	@Override
	public String getType(String name){
		String type = null;
		Field f = Field.getFieldByName(name);
		if(f != null){
			type = f.getType();
		}
		return type;
	}
	
	public TableColumn getField(String fieldName){
		return Field.getFieldByName(fieldName);
	}

}