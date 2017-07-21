package com.ociweb.gl.api;

public interface RouteFilter<T extends RouteFilter<T>> {
	
	T includeRoutes(int ... routeIds);
	
	T includeAllRoutes();
	
}