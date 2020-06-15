/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sarac
 */

public class PedidosDaoTest {
    
        static PedidosDao pedidos;
        static Pedido pedido = new Pedido(11111,111,11, new Date(2020-6-3), new Date(2020-6-19), new Date(1992-6-7),1 ,new BigDecimal(10.100),"destinatario","direccion","ciudad","region","28049","España");
        
        
    public PedidosDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        pedidos = new PedidosDao();
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConexion method, of class PedidosDao.
     */
    
    @Test
    public void testGetConexion() {
        System.out.println("getConexion");
        Connection resesperado = null;
        Connection resultado = pedidos.getConexion();
        assertNotEquals(resesperado, resultado);
    }

    /**
     * Test of read method, of class PedidosDao.
     */
    
    @Test
    public void testRead() {
       System.out.println("testRead");
        Integer idPedido = 10248;
        Pedido result = pedidos.read(idPedido);
        assertEquals(result.getId(), idPedido);

    }

    /**
     * Test of insert method, of class PedidosDao.
     */
    
    @Test
    public void testInsert() {
        System.out.println("testInsert");  
        Pedido pedido = null;
        Integer resesperado = null;
        Integer resultado = pedidos.insert(pedido);
        assertEquals(resesperado, resultado);
        pedido = new Pedido(11111,111,111,new Date(2020-05-04),new Date(2020-06-04),new Date(2020-05-15),111, new BigDecimal(13.9700),"Sara Casado","Olimpica 5","Madrid",null,"28935","España"); 
        resultado = pedidos.insert(pedido);
        assertNotEquals(pedido.getId(), resultado);
        
        
    }

    /**
     * Test of update method, of class PedidosDao.
     */
    
    @Test
    public void testUpdate() {
        System.out.println("testUpdate");
        Pedido pedido = null;
        Integer resesperado = 0;
        Integer resultado = pedidos.update(pedido);
        assertEquals(resesperado, resultado);
    }

    /**
     * Test of delete method, of class PedidosDao.
     */
    
    @Test
    public void testDelete() {
        System.out.println("testDelete");
        Integer id = 22222;
        int resultado;
        resultado = pedidos.delete(id);
        assertEquals(resultado, 0);
        
        Integer resultado2 = pedidos.delete(22222);
        Integer resesperado2 = 1;        
        assertEquals(resesperado2,resultado2);  
        System.out.println("Error en la base de datos");
    }

    /**
     * Test of listar method, of class PedidosDao.
     */
    
    @Test
    public void testListar() {
        System.out.println("testListar");
        ArrayList<Pedido> resesperado = new ArrayList<>();
        Integer posicion = 9;
        Pedido pedidodos = new Pedido(11111,111,11, new Date(2020-6-3), new Date(2020-6-19), new Date(2020-6-7),111 ,new BigDecimal(50.500),"destinatario","direccion","ciudad","region","28935","España");
        resesperado.add(pedido);
        ArrayList<Pedido> resultado = pedidos.listar(posicion);
        assertEquals(resultado.get(0).getId(), pedidodos.getId());

    }
    
}
