package br.com.odilonfontes.desafiosessaovotacaoapi;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({
        "br.com.odilonfontes.desafiosessaovotacaoapi.domain"
})
public class UnitTests { }
