# AndroidMailUtility

This class will be used to send emails through Android App


	==================Add This permission to AndroidManifest.xml ==================================
 <uses-permission android:name="android.permission.INTERNET" >
    </uses-permission>
	

	
		
		==================Add This code to Activity class 	Mostly in oncreate ==================================
    
		android.os.StrictMode.ThreadPolicy tp = android.os.StrictMode.ThreadPolicy.LAX;
		android.os.StrictMode.setThreadPolicy(tp);
		
		MailUtility mu = new MailUtility();
		HashMap param = new HashMap();
		param.put("to", "teamtechnowings@gmail.com");
		param.put("from", AndroidConstants.EMAIL_ID);
		param.put("user", AndroidConstants.EMAIL_ID);
		param.put("password", AndroidConstants.EMAIL_PASS);
		param.put("subject", "Activation Code From Team Appshell ");
		param.put("body", "Kindly enter the activation key as "
				+ ". kindly do not share this key with anyone else.");
		param.put("user", AndroidConstants.EMAIL_ID);
		mu.sendEmail(param);
    
    =========================Add the provided jar files in AndroidProject\lib folder
