package com.ifpb.mongodb.view;

import com.ifpb.mongodb.dao.PessoaDao;
import com.ifpb.mongodb.model.Pessoa;

public class App {

    public static void main(String[] args) {

        PessoaDao dao = new PessoaDao();

//        dao.salvar(new Pessoa("222.222.222-02", "Maria", 19));

//        System.out.println(dao.listar());

//        System.out.println(dao.buscarPorCpf("XXX"));

        dao.atualizar(new Pessoa("111.111.111-01",
                "João Paulo", 22));

    }

}
