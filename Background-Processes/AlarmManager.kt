AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (i * 1000), pendingIntent);
