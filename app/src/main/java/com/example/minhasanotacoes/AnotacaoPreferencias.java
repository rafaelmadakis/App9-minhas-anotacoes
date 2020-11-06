package com.example.minhasanotacoes;

import android.content.Context;
import android.content.SharedPreferences;

/*Created by Rafael Madakis */
public class AnotacaoPreferencias {

    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private final String NOME_ARQUIVO = "anotacao.preferencias";
    private final String CHAVE_NOME = "nome";

    public AnotacaoPreferencias(Context c) {
        this.context = c;
        preferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = preferences.edit();
    }

    /**
     * Classe para salvar as anotações
     */
    public void salvarAnotacao(String anotacao) {
        editor.putString(CHAVE_NOME, anotacao);
        editor.commit();
    }

    /**
     * Classe para recuperar as anotações salvas
     *
     * @return
     */
    public String recuperarAnotacao() {
        return preferences.getString(CHAVE_NOME, "");
    }
}
