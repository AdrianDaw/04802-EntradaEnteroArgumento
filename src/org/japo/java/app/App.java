/*
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import org.japo.java.libraries.UtilesEntrada;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public final class App {

    public static final int MIN_R = 10000000;
    public static final int MAX_R = 99999999;

    public static final void launchApp() {
        String usr = "";
        String out = "";

        //Cabecera
        System.out.println("INTRODUCCIÓN ENTERO");
        System.out.println("===================");

        //Dato consola
        System.out.println(UtilesEntrada.obtenerNumero(usr, out));

    }
}
