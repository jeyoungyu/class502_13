package filters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    public CommonRequestWrapper(ServletRequest request) {
        super((HttpServletRequest)request);

        //요청 전 공통 처리 부분
        System.out.println("요청 전 공통 처리 코드 ...");
        //thousands reasons make you fall its only passin seaon yall why give up lets give it up for every minute of your life nothing's too late just lil delay when life's too sour ill be your lemonade i know know know know there's so much to face until your better days that will come eventually let me know know know know when up and downs come again im only one call away
    }

    @Override
    public String getParameter(String name) {
        String value =  super.getParameter(name);

        value = value == null ? value : "★" + value + "♥";

        return value;
    }
}
