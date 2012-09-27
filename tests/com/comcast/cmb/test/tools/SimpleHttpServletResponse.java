package com.comcast.cmb.test.tools;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;



public class SimpleHttpServletResponse implements HttpServletResponse {

    private int _status;
    private String _contentType = null;
    private String _errorDesc = null;
    private PrintWriter writer = null;
    private OutputStream out = null;
    
    public SimpleHttpServletResponse() {
		out = new ByteArrayOutputStream();
    	writer = new PrintWriter(out); 
    }

    @Override
    public void flushBuffer() throws IOException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getBufferSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getCharacterEncoding() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getContentType() {
        return _contentType;
    }

    @Override
    public Locale getLocale() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        return new SimpleServletOutputStream(out);
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        return writer;
    }

    @Override
    public boolean isCommitted() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void resetBuffer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setBufferSize(int arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setCharacterEncoding(String arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setContentLength(int arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setContentType(String arg0) {
        _contentType = arg0;
        
    }

    @Override
    public void setLocale(Locale arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addCookie(Cookie arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addDateHeader(String arg0, long arg1) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addHeader(String arg0, String arg1) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addIntHeader(String arg0, int arg1) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean containsHeader(String arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String encodeRedirectURL(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String encodeRedirectUrl(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String encodeURL(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String encodeUrl(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    
    public String getHeader(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    
    public Collection<String> getHeaderNames() {
        // TODO Auto-generated method stub
        return null;
    }

    
    public Collection<String> getHeaders(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    
    public int getStatus() {
        // TODO Auto-generated method stub
        return _status;
    }

    @Override
    public void sendError(int arg0) throws IOException {
        _status = arg0;
        
    }

    @Override
    public void sendError(int arg0, String arg1) throws IOException {
        _status = arg0;
        _errorDesc = arg1;
        
    }

    @Override
    public void sendRedirect(String arg0) throws IOException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setDateHeader(String arg0, long arg1) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setHeader(String arg0, String arg1) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setIntHeader(String arg0, int arg1) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setStatus(int arg0) {
        _status = arg0;        
    }

    @Override
    public void setStatus(int arg0, String arg1) {
        // TODO Auto-generated method stub
        
    }
    
    public void setOutputStream(OutputStream out) {
    	this.out = out;
    	writer = new PrintWriter(out); 
    }
}