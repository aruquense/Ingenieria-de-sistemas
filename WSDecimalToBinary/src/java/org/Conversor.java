/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author aru
 */
@Stateless
@Path("/conversor")
public class Conversor {
    @GET
    public String conversor(@QueryParam("num") int num){
        return Integer.toString(num,2); 
    }

    
}
