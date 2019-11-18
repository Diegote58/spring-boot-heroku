package com.dg.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface ConstantConfig {


	public static final String SYSTEM_TIMEZONE = "America/Argentina/Buenos_Aires";
	

	public static final String LOOKUP_DROUGHT = "DROUGHT";
	public static final String LOOKUP_RAIN = "RAIN";
	public static final String LOOKUP_HEAVY_RAIN = "HEAVY_RAIN";
	public static final String LOOKUP_OPTIMAL_CONDITIONS = "OPTIMAL_CONDITIONS";
	public static final String LOOKUP_OTHER_CONDITIONS = "OTHER_CONDITIONS";

	public static final String SLOPE_EXIST = "slope_exist";
	public static final String SLOPE_VERTICAL = "slope_vertical";
	public static final String SLOPE_HORIZONTAL = "slope_horizontal";
	
	public static final Map<String, String> WEATHEAR_STATUS = Collections
			.unmodifiableMap(new HashMap<String, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(LOOKUP_DROUGHT, "Sequía");
					put(LOOKUP_RAIN, "Lluvia");
					put(LOOKUP_HEAVY_RAIN, "Lluvia intensa");
					put(LOOKUP_OPTIMAL_CONDITIONS, "condiciones optimas");
					put(LOOKUP_OTHER_CONDITIONS, "otras condiciones");
				}
			});
}
