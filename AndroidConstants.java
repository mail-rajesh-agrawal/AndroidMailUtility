package com.helper;

import java.util.HashMap;

import android.media.MediaPlayer;

public class AndroidConstants {


	public static long password_timeout_duration = 60 * 1000;
	public static String EMAIL_FROM_NAME = "Security Threats Team";
	public static String EMAIL_PASS = "";
	public static String EMAIL_ID = "testyouracc@gmail.com";
	public static String SDCARD_UM_FILE = "/data/data/com.activity.appshell/um.bin";						//"/sdcard/um.bin";
	public static String CLIENT_EMAIL_ID = "testyouracc@gmail.com";
	public static boolean REGISTER_BYPASS = false;



	public static HashMap displayRequest(String request) {

		System.out.println(" ------------------------------");

		System.out.println("parameters:");

		HashMap parameters = new HashMap();
		try {
			String[] sp = request.split("&");
			String pname;
			String pvalue;

			for (int i = 0; i < sp.length; i++) {
				String paraNames = sp[i];
				try {
					String key = paraNames.split("=")[0];
					String value = paraNames.split("=")[1];
					parameters.put(key, value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			System.out.println(" ------------------------------");

		} catch (Exception e) {
			// TODO: handle exception
		}
		return parameters;
	}

}
