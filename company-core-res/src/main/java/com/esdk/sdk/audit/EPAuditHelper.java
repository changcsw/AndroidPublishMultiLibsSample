package com.esdk.sdk.audit;

public class EPAuditHelper  {

    private EPAuditHelper() {
    }

    private static final class AuditHolder {
        private static final EPAuditHelper INSTANCE = new EPAuditHelper();
    }

    public static EPAuditHelper getInstance() {
        return AuditHolder.INSTANCE;
    }


}
