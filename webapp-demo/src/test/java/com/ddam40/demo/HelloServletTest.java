package com.ddam40.demo;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public final class HelloServletTest {
  @Mock
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;
  @Mock
  private RequestDispatcher requestDispatcher;

  @Before
  public final void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public final void doGet() throws IOException {
    StringWriter stringWriter = new StringWriter();
    PrintWriter printWriter = new PrintWriter(stringWriter);
    when(response.getWriter()).thenReturn(printWriter);
    new HelloServlet().doGet(request, response);
    assertEquals("Hello, World!", stringWriter.toString());
  }

  @Test
  public void doPostWithName() throws Exception {
    when(request.getParameter("name")).thenReturn("Dolly");
    when(request.getRequestDispatcher("response.jsp")).thenReturn(requestDispatcher);

    new HelloServlet().doPost(request, response);

    verify(request).setAttribute("user", "Dolly");
    verify(requestDispatcher).forward(request, response);
  }
}
