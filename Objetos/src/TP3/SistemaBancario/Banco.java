package TP3.SistemaBancario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Banco {
    private String name;
    //private Map<int,Integer> claveClientes;

    private int idCliente;
    private Map<Integer, Cliente> clientesMap;

    private ArrayList<Cliente> clientes;

    public Banco(String name) {
        this.name = name;
        clientes = new ArrayList<Cliente>();
        clientesMap = new HashMap<Integer, Cliente>();
        idCliente = 0;
    }

    public void addCliente(Cliente c) {
        clientesMap.put(idCliente, c);
        idCliente++;
    }

    //private


}
