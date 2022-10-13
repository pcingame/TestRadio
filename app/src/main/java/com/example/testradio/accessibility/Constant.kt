/*
 * Copyright © OMRON HEALTHCARE Co., Ltd. 2020. All rights reserved.
 */

package com.example.testradio.accessibility

@Suppress("unused")
object Constant {
    const val TIME_OUT_REQUEST_IN_SPLASH: Long = 3000
    const val BLOOD_PRESSURE_GUIDE_VIDEO_INTRO_KEY = "BPGuide.mp4"
    const val WELCOME_BLOOD_PRESSURE_VIDEO_INTRO_KEY = "WelComeHP.mp4"
    const val WHAT_HIGH_BLOOD_PRESSURE_VIDEO_INTRO_KEY = "WhatHighBP.mp4"
    const val HOW_HYPERTENSION_PLUS_HELP_VIDEO_INTRO_KEY = "HowHPHelp.mp4"
    const val SUB_BLOOD_PRESSURE_GUIDE = "BPGuide"
    const val SUB_WELCOME_BLOOD_PRESSURE = "WelComeHP"
    const val SUB_WHAT_HIGH_BLOOD_PRESSURE = "WhatHighBP"
    const val SUB_HOW_HYPERTENSION_PLUS_HELP = "HowHPHelp"
    const val MODE_VERIFY_EMAIL_PHONE = 1
    const val MODE_VERIFY_CREATE_ACCOUNT = 2
    const val MODE_VERIFY_PHONE = 4
    const val MODE_VERIFY_PHONE_RESEND = 2
    const val INCORRECT_EMAIL = "GERROR999013"
    const val INCORRECT_PASSWORD = "GERROR001113"
    const val ACCOUNT_LOCKED = "GERROR003035"
    const val ACCOUNT_IS_CHANGE_PASSWORD = "GERROR999200"
    const val ACCOUNT_IS_NOT_VERIFIED = "GERROR999022"
    const val CODE_ACCOUNT_NOT_FOUND = "GERROR999024"
    const val SIGN_IN_ERROR_CODE_NOT_VERIFY_MAIL_UPDATE = "GERROR999023"
    const val GERROR999203 = "GERROR999203"
    const val SIGN_IN_ERROR_CODE_NOT_VERIFY_PHONE_CREATE_1 = "GERROR999021"
    const val SIGN_IN_ERROR_CODE_NOT_VERIFY_PHONE_CREATE_2 = "GERROR999025"
    const val OLD_VERIFY_CODE_IS_STILL_VALID = "GERROR999019"
    const val OLD_VERIFY_CODE_IS_PHONE_IS_EXISTED = "GERROR004011"
    const val OLD_VERIFY_CODE_IS_PHONE_IS_INVALID = "GERROR999018"
    const val OLD_VERIFY_CODE_IS_PHONE_IS_OUT_OF_DATE = "GERROR999017"
    const val EMAIL_UPDATE_IS_EXISTED = "GERROR004008"
    const val GERROR999000 = "GERROR999000"
    const val GERROR009999 = "GERROR009999"
    const val GERROR003057 = "GERROR003057"
    const val GERROR006010 = "GERROR006010"
    const val GERROR007021 = "GERROR007021"
    const val GERROR002064 = "GERROR002064"
    const val GERROR002065 = "GERROR002065"
    const val GERROR002066 = "GERROR002066"
    const val GERROR002067 = "GERROR002067"

    // Webview Measurement Week
    const val MEASUREMENT_WEEK_URL =
        "https://www.nhs.uk/conditions/high-blood-pressure-hypertension"

    // url browser help settings screen
    const val ABOUT_BLOOD_PRESSURE_URL =
        "https://www.nhs.uk/conditions/high-blood-pressure-hypertension"
    const val ABOUT_MEDICATION_URL = "https://www.nhs.uk/medicines/"
    const val DASHBOARD_SETTING_URL = "/dashboard/settings.xml?v=1630316058685"

    // data sync start
    const val CODE_TREATMENTS = "TREATMENTS"
    const val CODE_MEDICATIONS = "MEDICATIONS"
    const val CODE_BLOOD_PRESSURES = "BLOODPRESSURES"
    const val CODE_INDEXES_DATA = "CODEINDEXESDATA"
    const val CODE_ACTIONS = "ACTIONS"
    const val CODE_QUESTIONNAIRES = "QUESTIONNAIRES"
    const val CODE_REMINDERS = "REMINDERS"
    const val CODE_CYCLES = "CYCLES"
    const val CODE_SYNC_DEVICE = "CODE_SYNC_DEVICE"
    const val CODE_SYNC_PROGRAMME = "CODE_SYNC_PROGRAMME"
    const val CODE_CONFIG_QUESTION = "CODE_CONFIG_QUESTION"
    const val SERVER_PRIORITIZE = 0
    const val LOCAL_PRIORITIZE = 1
    const val TYPE_TERM = "TYPE_TERM"
    const val TYPE_PRIVACY = "TYPE_PRIVACY"
    const val TYPE_LICENSE = "TYPE_LICENSE"
    const val TYPE_HELP_INSTRUCTION = "TYPE_HELP_INSTRUCTION"
    const val TYPE_HELP_INTRODUCTION = "TYPE_HELP_INTRODUCTION"
    const val TYPE_HELP_CREATE_ACCOUNT = "TYPE_HELP_CREATE_ACCOUNT"

    const val EXPLAIN_CALENDAR_VIEW =
        "Directly setting this along with related properties causes repeated invalidation of view holders."
    const val LINK_HELP_LICENSE = "file:///android_asset/html/html/licenses.html"
    const val LINK_TYPE_PRIVACY = "file:///android_asset/html/html/privacy.html"
    const val LINK_TYPE_TERM = "file:///android_asset/html/html/term.html"
    const val LINK_TYPE_HELP_CREATE_ACCOUNT = "file:///android_asset/html/html/155056395.html"
    const val LINK_HELP_INTRODUCTION = "file:///android_asset/html/html/156349195.html"
    const val LINK_HELP_INSTRUCTION = "file:///android_asset/html/html/index.html"
    const val LOCAL_PRIVACY_NAME = "privacy.html"
    const val LOCAL_TERM_NAME = "term.html"

    const val LANG_EN = "en_GB"

    /**
     * Is string check Emoji
     */
    @Suppress("unused")
    const val REGEX: String =
        "([\\u20a0-\\u32ff\\ud83c\\udc00-\\ud83d\\udeff\\udbb9\\udce5-\\udbb9\\udcee])"

    private const val REQUEST_TIMEOUT = 408
    private const val TOO_MANY_REQUEST = 429
    private const val INTERNAL_SERVER_ERROR = 500
    private const val TOO_MANY_USERS = 503
    private const val SERVICE_UNAVAILABLE = 503
    private const val GATEWAY_TIMEOUT = 504
    val LIST_CODE_SHOULD_CALL_RETRY = arrayOf(
        REQUEST_TIMEOUT,
        TOO_MANY_REQUEST,
        INTERNAL_SERVER_ERROR,
        TOO_MANY_USERS,
        SERVICE_UNAVAILABLE,
        GATEWAY_TIMEOUT
    )
    const val INDEX_TREATMENTS = 0
    const val INDEX_MEDICATIONS = 1
    const val INDEX_BLOOD_PRESSURES = 2
    const val INDEX_ACTIONS = 3
    const val INDEX_QUESTIONNAIRES = 4
    const val INDEX_REMINDERS = 5
    const val INDEX_CYCLES = 6
    const val INDEX_SYNC_DEVICE = 7
    const val INDEXES_DATA = 8
    private const val ALLOWED_CHARACTERS = "[-a-zA-Z0-9+&@#/%?=~_|!:,.;*'()\$^「」\"]"
    const val REGEX_URL = "^(http|https)://$ALLOWED_CHARACTERS*$ALLOWED_CHARACTERS$"

    // / set the update time of the models when the User performs a data create in the offline network state
    const val UPDATED_DATETIME_LOCAL_CREATE: Long = -1

    // set the update time of the models when the User performs a data update in the offline network state
    const val UPDATED_DATETIME_LOCAL_UPDATE: Long = -2

    // set the update time of the models when the User performs a data update or create not save by server
    const val UPDATED_DATETIME_DO_NOTHING: Long = -3

    // set the update time of the models medication when gen medication in home
    const val UPDATED_DATETIME_MEDICATION_GEN: Long = -4

    // flag to not update update time of table sync info
    const val TIME_NOT_UPDATE_SYNC_INFO: Long = -1

    // blood pressure graph
    const val NUMBER_DAY_OF_YEAR = 365
    const val NUMBER_DAY_OF_MONTH = 30
    const val NUMBER_MONTH_OF_YEAR = 12
    const val NUMBER_DAY_FOR_WEEK = 7
    const val SPACE_SUNDAY_TO_SATURDAY = 6
    const val NUMBER_WEEK_DATA_MONTH = 5
    const val SPACE_MONDAY_TO_SATURDAY = 5
    const val SPACE_MONDAY_TO_FRIDAY = 4

    // Logファイルの最大出力数
    const val LOG_FILE_MAX_COUNT = 3

    // Logファイル名
    const val LOG_FILE_NAME = "appLog"

    // Show case View
    const val TEXT_SIZE_TITLE = 17 // 1000mls = 1s
    const val TEXT_SIZE_TITLE_SUB = 15 // 1000mls = 1s

    // amplitude negative(-5) and positive(+5) target blood pressure Measurement
    const val AMPLITUDE_TARGET_BPM = 5

    // number of cycle 0
    const val NUMBER_CYCLE_0 = 0

    // number of cycle 1
    const val NUMBER_CYCLE_1 = 1

    const val MAX_LENGTH_EMAIL = 128
    const val MAX_LENGTH_PASS_WORD = 99
    const val MAX_LENGTH_PHONE_NUMBER = 16

    // number of retry call to server when an error occurs
    const val API_CALL_RETRY_COUNT = 3

    const val KEY_LANGUAGE_DEFAULT = "DEF"
    const val KEY_LANGUAGE_DE = "DE"
    const val KEY_LANGUAGE_EN = "EN"
    const val KEY_LANGUAGE_JA = "JA"

    const val MEDICATION_FREQUENCY_1 = 1
    const val MEDICATION_FREQUENCY_2 = 2
    const val MEDICATION_FREQUENCY_3 = 3
    const val MEDICATION_FREQUENCY_4 = 4
    const val REMINDER_ON = 1
    const val REMINDER_OFF = 0
    const val STATUS_REMINDER_ACTIVE = 1
    const val STATUS_REMINDER_DELETE = -1

    const val APP_ID = "X4fVSV7C"
    const val PACKAGE_NAME = "com.omron.healthcare.htplus.test"
    const val INDEX_CODE = "1,2,3"
    const val CODE_DEVICE_TYPE = "OGSC"
    const val CODE_SERIAL_ID = "0000000000000000"
    const val TIME_ONE_MINNUTE = 60000
    const val ORDER_ASCENDING = 1
    const val COUNT_ALL = -1
    const val OFFSET_START = 0
    const val CODE_NOTIFICATION_BP_MORNING = 1000
    const val CODE_NOTIFICATION_BP_EVENING = 10000
    const val CODE_NOTIFICATION_MED = 100000
    const val TIME_DELAY_REMINDER = 120000

    // max min time reminder morning
    const val TIME_MIN_MINUTE_AM_REMINDER = 0
    const val TIME_MAX_MINUTE_AM_REMINDER = 59
    const val TIME_MIN_HOUR_AM_REMINDER = 0
    const val TIME_MAX_HOUR_AM_REMINDER = 11

    // max min time reminder evening
    const val TIME_MIN_MINUTE_PM_REMINDER = 0
    const val TIME_MAX_MINUTE_PM_REMINDER = 59
    const val TIME_MIN_HOUR_PM_REMINDER = 18
    const val TIME_MAX_HOUR_PM_REMINDER = 23

    // max min time reminder afternoon
    const val TIME_MIN_MINUTE_AF_REMINDER = 0
    const val TIME_MAX_MINUTE_AF_REMINDER = 59
    const val TIME_MIN_HOUR_AF_REMINDER = 12
    const val TIME_MAX_HOUR_AF_REMINDER = 17

    // Home default max count action card undone
    const val MAX_COUNT_ACTION_CARD_UNDONE = 99
    const val AREA_CODE_JSON = "areaCode.json"
    const val AREA_CODE_URL_PATH = "/dashboard/configs/areaCode.json"
    const val NEXT_MEDICATION = "NEXT_MEDICATION"
    const val CHANGE_MEDICATION = "CHANGE_MEDICATION"
    const val NEW_MEDICATION = "NEW_MEDICATION"
    const val UPDATE_MEDICATION = "UPDATE_MEDICATION"
    const val NO_MEDICATION = "NO_MEDICATION"
    const val YOUR_NEXT_MW = "YOUR_NEXT_MW"

    /**
     * Measurement Place Home
     */
    const val MEASUREMENT_PLACE_HOME: Int = 1
    const val BLOOD_PRESSURE_DELETE: Int = -1

    const val SIZE_DOWNLOAD_FILE: Long = 150
    const val SYNC_DATA_SERVER_CODE: Int = 1
    const val SYNC_DATA_DEVICE_CODE: Int = 2
    const val DOWNLOAD_FILE_CODE: Int = 3
    const val CODE_ERROR: Int = 400

    /**
     * Account register and phone number settings
     */
    const val LENGTH_PHONE_VALIDATE = 2
    const val MAX_LENGTH_PHONE_VALIDATE = 20

    /**
     * Is variables the min value measurement 3rd
     */
    const val MIN_MEASUREMENT_3RD: Int = 5

    /**
     * Is variables the max value measurement 3rd
     */
    const val MAX_MEASUREMENT_3RD: Int = 20

    /**
     * Is variables the 1st and 2nd measurement should be spaced up to 10 minutes apart.
     */
    const val BETWEEN_MINUTE_1ST: Int = 10

    /**
     * Is key save to check kill app in pt_cr_6 screen
     */
    const val KEY_KILL_APP_IN_CR6 = "KEY_KILL_APP_IN_CR6"

    /**
     * Is key get patient id when kill app in pt_cr_6 screen
     */
    const val KEY_PATIENT_ID_TO_SPLASH = "KEY_PATIENT_ID_TO_SPLASH"

    /**
     * Is value of checked Terms Service when kill app in pt_cr_6 screen
     */
    const val KEY_TERMS_TO_SPLASH = "KEY_TERMS_TO_SPLASH"

    /**
     * Is key of cphone_number in cognito
     */
    const val KEY_STATUS_VERIFY_PHONE = "phone_number_verified"

    /**
     * Is key of selected date argument
     */
    const val ARG_SELECTED_DATE = "ARG_SELECTED_DATE"

    const val IS_SHOW_AVG = "IS_SHOW_AVG"

    const val DELAY_CALENDAR_WEEK = 700L

    const val DELAY_CALENDAR_MONTH = 1200L

    const val UPDATE_TIME_SYNC_FIRST_TIME = "1970-01-01T00:00:00.000Z"

    const val KEY_LAST_SYNC_INFO = "KEY_LAST_SYNC_INFO"

    /**
     * time to delay show keyboard when selected country code
     */
    const val TIME_DELAY_SHOW_KEY_BOARD = 200L

    /**
     * Is value of checked privacy Service when kill app in pt_cr_6 screen
     */
    const val KEY_PRIVACY_TO_SPLASH = "KEY_PRIVACY_TO_SPLASH"

    // CR #73130 - flag of enable/disable postural function
    const val IS_POSTURAL_DROP_ENABLE = false

    // delay of questionnaire notification = 5 minutes
    const val QUESTIONNAIRE_DELAY_TIME = 30000L

    // delay of dialog focus = 1 second
    const val DELAY_DIALOG_FOCUS = 1000L

    // SharePreferences of patientId
    const val PATIENT_ID = "PATIENT_ID"

    // SharePreferences of Has medication plan
    const val HAS_MEDICATION_PLAN = "HAS_MEDICATION_PLAN"

    // SharePreferences of Date of birth
    const val DATE_OF_BIRTH = "DATE_OF_BIRTH"

    // Nhs Login Account Management
    const val NHS_LOGIN_ACCOUNT_MANAGEMENT =
        "https://www.nhs.uk/nhs-app/nhs-app-help-and-support/nhs-app-account-and-settings/managing-your-nhs-app-account/"

    /**
     * Even Apptentive
     */
    const val EVENT_CLICK_LET_START = "onboarding_completed"
    const val EVENT_TUTORIAL_HOME_COMPLETED = "tutorial_home_completed"
    const val EVENT_TUTORIAL_BP_COMPLETED = "tutorial_measurements_completed"
    const val EVENT_TUTORIAL_MEDICATION_COMPLETED = "tutorial_medication_completed"
    const val EVENT_CLICK_BACK_INFORMATION_HOME = "tutorial_home_screen_exited"
    const val EVENT_CLICK_BACK_INFORMATION_BP = "tutorial_measurements_screen_exited"
    const val EVENT_CLICK_BACK_INFORMATION_MEDICATION = "tutorial_medication_screen_exited"
    const val EVENT_OPEN_HOME_TAB = "home_screen_open"
    const val EVENT_OPEN_MEASUREMENT_TAB = "measurements_screen_open"
    const val EVENT_OPEN_MEDICATION_TAB = "medication_screen_open"
    const val EVENT_CLICK_HERE_MW_BEFORE_INFO = "mw_before_info_click_nhs_link"
    const val EVENT_CLICK_HERE_MW_DURING = "mw_during_info_click_nhs_link"
    const val EVENT_BACK_FROM_MW_START = "mw_before_info_exit_screen"
    const val EVENT_BACK_FROM_MW_DURING = "mw_during_info_exit_screen"
    const val EVENT_CLICK_HERE_MS = "mw_completed_results_click_nhs_link"
    const val EVENT_CLICK_HERE_MS_INCOMPLETE = "mw_incomplete_results_click_nhs_link"
    const val EVENT_CLICK_HERE_MS_MISSED = "mw_missed_results_click_nhs_link"
    const val EVENT_BACK_FROM_MS = "mw_completed_results_exit_screen"
    const val EVENT_BACK_FROM_MW_INCOMPLETE = "mw_incomplete_results_exit_screen"
    const val EVENT_BACK_FROM_MW_MISSED = "mw_missed_results_exit_screen"
    const val EVENT_HOW_DO_YOU_FEEL_ANSWER_GOOD = "how_do_you_feel_answer_good"
    const val EVENT_HOW_DO_YOU_FEEL_ANSWER_BAD = "how_do_you_feel_answer_bad"
    const val EVENT_CONFIRM_ANSWERS_RED_QUESTION = "red_questionnaire_submit_answers"
    const val EVENT_SUBMIT_CRITICAL_SYMPTOM_RED_QUESTION =
        "red_questionnaire_confirm_critical_symptom"
    const val EVENT_CONFIRM_ANSWERS_YELLOW_QUESTION = "yellow_questionnaire_submit_answers"
    const val EVENT_ANSWER_NO_ALL_SYMPTOM_YELLOW_QUESTION =
        "yellow_questionnaire_confirm_no_symptoms"
    const val EVENT_ANSWER_YES_SYMPTOM_YELLOW_QUESTION = "yellow_questionnaire_confirm_symptoms"
    const val EVENT_CLICK_WORSE_FOLLOW_UP_QUESTION = "follow_up_question_home_screen_answer_worse"
    const val EVENT_CLICK_SAME_FOLLOW_UP_QUESTION = "follow_up_question_home_screen_answer_same"
    const val EVENT_CLICK_BETTER_FOLLOW_UP_QUESTION = "follow_up_question_home_screen_answer_better"
    const val EVENT_CLICK_GOOD_FOLLOW_UP_QUESTION =
        "how_do_you_feel_after_follow_up_question_answer_good"
    const val EVENT_CLICK_BAD_FOLLOW_UP_QUESTION =
        "how_do_you_feel_after_follow_up_question_answer_bad"
    const val EVENT_OPEN_CONTACT_GP_SCREEN = "contact_gp_open_screen"
    const val EVENT_HAVE_CONTACTED_MY_DOCTOR = "contact_gp_click_completed"
    const val EVENT_CONTACT_MY_DOCTOR_LATER = "contact_gp_click_later"
    const val EVENT_BACK_FROM_CONTACT_DOCTOR = "contact_gp_exit_screen"
    const val EVENT_UPDATE_MEDICATION_SCHEDULE_LATER = "update_medication_schedule_click_later"
    const val EVENT_UPDATE_MEDICATION_SCHEDULE_COMPLETE = "update_medication_schedule_completed"
    const val EVENT_UPDATE_MEDICATION_SCHEDULE_REMINDERS =
        "update_medication_schedule_click_reminders"
    const val EVENT_REVIEW_QUESTIONNAIRE_COMPLETED = "review_questionnaire_completed"

    // wait qa
    const val EVENT_LEARN_MORE_REVIEW_NEW_CHANGE_MEDICATION =
        "review_new_change_medication_click_learn_more"
    const val EVENT_CLICK_NEXT_LEARN_MORE_REVIEW_NEW_CHANGE_MEDICATION =
        "review_new_change_medication_learn_more_click_next"
    const val EVENT_REJECT_FROM_REVIEW_NEW_CHANGE_MEDICATION =
        "review_new_change_medication_click_reject"
    const val EVENT_REJECTED_GOT_IT_REVIEW_NEW_CHANGE_MEDICATION =
        "review_new_change_medication_rejected_completed"
    const val EVENT_ACCEPTED_GOT_IT_REVIEW_NEW_CHANGE_MEDICATION =
        "review_new_change_medication_accepted_completed"

    const val EVENT_CLICK_MEDICATION_LIST = "medication_click_medication_list"
    const val EVENT_CLICK_TREATMENT_PLAN = "medication_click_treatment_plan"
    const val EVENT_EXIT_TREATMENT_PLAN = "medication_treatment_plan_exit"
    const val EVENT_TAKEN_MEDICATION_IN_MEDICATION_TAB = "medication_mark_as_taken"
    const val EVENT_UNDO_TAKEN_MEDICATION_IN_MEDICATION_TAB = "medication_undo_mark_as_taken"
    const val EVENT_TAKEN_MEDICATION_IN_HOME_TAB = "home_medication_mark_as_taken"
    const val EVENT_UNDO_TAKEN_MEDICATION_IN_HOME_TAB = "home_medication_undo_mark_as_taken"
    const val EVENT_CLICK_FROM_REMINDER_SETTING = "settings_click_reminders"
    const val EVENT_TURN_OFF_REMINDERS = "settings_reminders_turn_off"
    const val EVENT_CLICK_EXIT_REMINDERS = "settings_exit_reminders"
    const val EVENT_CLICK_DATA_SYNC_FROM_SETTING = "settings_click_data_synchronisation"
    const val EVENT_CLICK_HELP_FROM_SETTING = "settings_click_help"
    const val EVENT_BACK_FROM_HELP_CENTER = "settings_exit_help_screen"
    const val EVENT_CLICK_CUSTOMER_SUPPORT = "settings_click_customer_support"
    const val EVENT_CLICK_SEND_EMAIL_CUSTOMER_SUPPORT = "customer_support_click_send_email"
    const val EVENT_BLOOD_URINE_SCHEDULE_TEST_COMPLETE = "blood_and_urine_test_schedule_completed"
    const val EVENT_BLOOD_URINE_SCHEDULE_MARK_AS_TAKEN = "blood_and_urine_test_click_mark_as_taken"
    const val EVENT_BLOOD_URINE_SCHEDULE_LATER = "blood_and_urine_test_click_schedule_later"
    const val EVENT_BLOOD_SCHEDULE_TEST_COMPLETE = "blood_test_click_schedule_completed"
    const val EVENT_BLOOD_SCHEDULE_MARK_AS_TAKEN = "blood_test_click_mark_as_taken"
    const val EVENT_BLOOD_SCHEDULE_LATER = "blood_test_click_schedule_later"
    const val EVENT_URINE_SCHEDULE_TEST_COMPLETE = "urine_test_schedule_completed"
    const val EVENT_URINE_SCHEDULE_MARK_AS_TAKEN = "urine_test_click_mark_as_taken"
    const val EVENT_URINE_SCHEDULE_LATER = "urine_test_click_schedule_later"
    const val EVENT_CONFIRM_ABOUT_NEXT_MEASUREMENT_WEEK = "about_next_measurement_week_confirm"

    // Key custom data Apptentive
    const val CS_PATIENT_ID = "patient_id"
    const val CS_CCG = "ccg"
    const val CS_PCN = "pcn"
    const val CS_GP_SURGERY = "gp_surgery"
    const val CS_SUBSCRIBED_PROGRAMS = "subscribed_programs"
    const val CS_NUMBER_OF_DAYS_ON_APP = "number_of_days_on_app"
    const val CS_DATE_OF_JOINING_APP = "date_of_joining_app"
    const val CS_ONBOARDING_COMPLETED = "onboarding_completed"
    const val CS_AT_LEAST_ONE_READING_SUBMITTED = "at_least_one_reading_submitted"
    const val CS_DATE_OF_LAST_MEASUREMENT_ADDED = "date_of_last_measurement_added"
    const val CS_IN_MEASUREMENT_WEEK = "in_measurement_week"
    const val CS_PERCENTAGE_OF_MW_COMPLETED = "percentage_of_mw_completed"
    const val CS_RECENT_NUMBER_OF_MW_MISSED = "recent_number_of_mw_missed"
    const val CS_PRIVACY_POLICY = "privacy_policy"

    const val CS_STEP = "step"
    const val CS_ACCUMULATED_NUMBER_OF_COMPLETED_MW = "accumulated_number_of_completed_mw"

    const val MEDICATION_TREATMENT_MEDICINE_ID = "MEDICATION_TREATMENT_MEDICINE_ID"
    const val MEDICATION_MEDICINE_ID = "MEDICATION_MEDICINE_ID"
    const val REMINDER_MEDICATION_MEDICINE_ID = "REMINDER_MEDICATION_MEDICINE_ID"
    const val REMINDER_MEDICATION_TREATMENT_MEDICINE_ID =
        "REMINDER_MEDICATION_TREATMENT_MEDICINE_ID"
    const val STEP_ID = "STEP_ID"
    const val OHQ_DEV = "ohqDev"

    const val TYPE_BLOOD = 1
    const val TYPE_PULSE = 2
    const val TYPE_WEIGHT = 3

    // name index, measure tag reminder
    const val INDEX_TAG_BLOOD_PRESSURE = "index_blood_pressure"
    const val INDEX_TAG_WEIGHT = "index_weight"
    const val INDEX_TAG_PULSE = "index_pulse"
    const val INDEX_TAG_TYPE = 0
    const val MEASURE_TAG_TYPE = 1

    // name measure tag recorded data index config measure
    const val MEASURE_TAG_SYS_BLOOD_PRESSURE = "bp_systolic"
    const val MEASURE_TAG_DIA_BLOOD_PRESSURE = "bp_diastolic"
    const val MEASURE_TAG_PULSE_BLOOD_PRESSURE = "pulse"
    const val MEASURE_TAG_WEIGHT_WEIGHT = "weight"

    const val PT_WORSE = 0
    const val PT_SAME = 1
    const val PT_BETTER = 2

    // QUESTIONNAIRE
    const val HF_DAILY_ASSESSMENT = "hf_daily_assessment"
    const val HF_PURPLE = "hf_purple"

    const val IS_FROM_BLOOD_PRESSURE = "IS_FROM_BLOOD_PRESSURE"
    const val IS_FROM_INDEX = "IS_FROM_INDEX"
    const val IS_SYNC_REQUIRED_CONTACT_GP = "IS_SYNC_REQUIRED_CONTACT_GP"
    const val NEXT_TAG_QUESTIONNAIRE = "NEXT_TAG_QUESTIONNAIRE"
    //Save tag PHQ9
    const val NEXT_TAG_QUESTIONNAIRE_PHQ_9 = "NEXT_TAG_QUESTIONNAIRE_PHQ_9"

    // SECTION
    const val HF_PURPLE_SYMPTOMS = "hf_purple_symptoms"
    const val PHQ2 = "phq2"
    const val PHQ9 = "phq9"

    const val OPERATOR_BIG = "\">\","
    const val OPERATOR_LESS = "\"<\","
    const val OPERATOR_LESS_OR_EQUAL = "\"<=\","
    const val OPERATOR_BIG_OR_EQUAL = "\"<=\","
    const val OPERATOR_EQUAL = "\"==\","
    const val OPERATOR_DIFF = "\"difference\","
    const val SECTION = "\"section\","
    const val QUESTION = "\"question\","

    const val QUES_OR = "\"OR\","
    const val QUES_AND = "\"AND\","
    const val QUES_YES = "YES"
    const val QUES_NO = "NO"

    const val INPUT_RED_QUESTIONNAIRE = "INPUT_RED_QUESTIONNAIRE"
    const val HOW_DO_YOU_FEEL_TODAY = 1
    const val PATIENT_TRACKED_PUSH_DATA = 2
    const val APART_FROM_DATA = 3
    const val MONTHLY_HF = 4
    const val OUT_OF_LIMIT = 5
    const val CONDITION_PHQ2_FOLLOW_UP = "CONDITION_PHQ2_FOLLOW_UP"
    const val CONDITION_PHQ2_ALERT = "CONDITION_PHQ2_ALERT"
    const val COMPLETED_RED_QUESTIONNAIRE_SHOW_CONTACT_GP =
        "COMPLETED_RED_QUESTIONNAIRE_SHOW_CONTACT_GP"
    const val COMPLETED_YELLOW_QUESTIONNAIRE = "COMPLETED_YELLOW_QUESTIONNAIRE"
    const val RED_LOAD_FAIL = "RED_LOAD_FAIL"
    const val ANSWER_HOW_FEEL_TODAY = "ANSWER_HOW_FEEL_TODAY"
    const val DAILY_GOOD = "good"
    const val DAILY_BAD = "bad"

    const val PROGRAMME_VALIDATED = "VALIDATED"

    const val STEP_NUMBER_OTHER_MEDICATION = -99
    const val DELAY_CLICK_CONFIRM = 5000
}
