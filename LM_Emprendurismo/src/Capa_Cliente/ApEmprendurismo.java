/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capa_Cliente;

/**
 *
 * @author jefer
 */
public class ApEmprendurismo {

    /**
     2. Elaborar un programa aplicando Listas Múltiples de una organización
dedicada al EMPRENDEDURISMO E INNOVACIÓN encargada gestionar la
subvención de los proyectos de los participantes.
En este caso UNA empresa de inversión puede subvencionar a N proyectos
de inversión.
Un Proyecto de inversión tiene los atributos: Código del proyecto, nombre
del proyecto, país (considere: España, México, EEUU, Puerto Rico y
Colombia), fecha de inicio del proyecto, duración (en meses), costo, tipo
(considera: ambiental, social, tecnológica).
La Empresa de inversión tiene los atributos: código de la empresa, nombre
de la empresa, tipo empresa (considere: pública o privada) y máxima
inversión que puede realizar.
Realizar lo siguiente:
a) Ingresar un nuevo Proyecto.
b) Ingresar una nueva Empresa.
c) Mostrar el proyecto de mayor costo de inversión.
d) Dada una Empresa, mostrar el listado de proyectos que subvenciona.
e) Dada una Empresa, mostrar el número de proyectos por país.
f) Dado el año de inicio, mostrar el número de empresas de inversión por
tipo.
g) Dado el tipo de empresa, mostrar los proyectos que subvencionó los años
2020 y 2021.
* 
* Para la lista de empresas, hemos considerado una lD porque no todas las
* empresas pueden ser parte de un programa de investigaciòn y, dificilmente,
* se uniràn
* 
* Para la lista de proyectos de investigaciòn, hemos considerado una LE porque
* constantemente apareceràn nuevos proyectos que quieran contribuir a ls sociedad

     
     */
    public static void main(String[] args) {
        new FrmMenuPrincipal().setVisible(true);
    }
    
}
