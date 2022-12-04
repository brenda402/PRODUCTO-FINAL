-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-12-2022 a las 19:45:15
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `educativo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejercicio`
--

CREATE TABLE `ejercicio` (
  `id_ejercicio` int(11) NOT NULL,
  `ejercicio_text` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ejercicio`
--

INSERT INTO `ejercicio` (`id_ejercicio`, `ejercicio_text`) VALUES
(1, 'Diagnostico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `informacion`
--

CREATE TABLE `informacion` (
  `id_informacion` int(11) NOT NULL,
  `titulo` varchar(30) NOT NULL,
  `cuerpo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `informacion`
--

INSERT INTO `informacion` (`id_informacion`, `titulo`, `cuerpo`) VALUES
(1, 'Introducción', 'C++ es un lenguaje que te permite tener muchísimo control sobre el sistema que te encuentras trabajando. \r\nAprender C++ te hará indudablemente mejor programador sin importar cuál sea el lenguaje de programación que más utilices. \r\nNo obstante, para el uso efectivo de este lenguaje es necesario conocer cómo utilizarlo según las buenas prácticas modernas y aprovechando herramientas que te hagan más efectivo.\r\nDurante este pequeño espacio de aprendizaje estaremos aprendiendo conceptos sobre c++ y estaremos practicando lo aprendido \r\nAdicional, veremos cómo funciona C++ más a detalle, cómo se integran las distintas piezas de código.\r\nProgramar en C++ no es únicamente sobre el lenguaje, sino que es necesario saber aprovechar herramientas que te hagan más efectivo al momento de escribir el código. Es por ello por lo que introduciremos paulatinamente las siguientes herramientas:\r\nEspero que disfrutes de este proyecto de aprendizaje tanto como yo disfruté armándolo. Si tienes cualquier duda o comentario sobre el contenido no dudes utilizar las herramientas de comunicación. ¡Feliz aprendizaje!'),
(2, 'Entornos de desarrollo', 'C y C++ son lenguajes bastante utilizados en la actualidad y en los que hay muchos entornos de desarrollos que se pueden utilizar para programar. Vamos a indicar un listado de entornos gratuitos que podemos utilizar para programar ya sea en C o C++.\r\nCodeLite\r\nCodeLite es una IDE multiplataforma libre y de código abierto para los lenguajes C/C++ que usa wxWidgets para su interfaz gráfica. Para cumplir con el espíritu de código abierto de CodeLite, se compila y depura usando solo herramientas libres (MinGW y GDB).\r\nCodeLite ofrece gestión de proyectos (espacios de trabajo/proyectos), autocompletación de código, navegación por los ficheros fuente, resaltado de syntaxis, integración con Subversion, Cscope y UnitTest++, un debugger interactivo montado sobre gdb y un editor de código potente, basado en Scintilla Se distribuye bajo licencia la licencia GNU General Public License v2 o posterior.\r\nCode Blocks\r\nCode::Blocks es un entorno de desarrollo integrado libre y multiplataforma para el desarrollo de programas en lenguaje C++. Está basado en la plataforma de interfaces gráficas WxWidgets, lo cual quiere decir que puede usarse libremente en diversos sistemas operativos, y está licenciado bajo la Licencia pública general de GNU.'),
(3, 'Estructuras de datos', 'Tipos nativos o primitivos de C++\r\nLos tipos nativos de C++, son los tipos de datos \"fáciles de usar\" es decir, como veremos un poco más adelante en la sección de tipos primitivos. Los tipos primitivos como su nombre lo da a entender, son los tipos de datos más básicos y simples del sistema de tipos de C++ y por ello es bastante fácil usarlos.\r\n'),
(4, 'tipos de datos', '\r\nbool: El tipo de dato bool, tiene un tamaño de 8 bits y un rango entre 0 y 1, en pocas palabras es cero o es uno (falso o verdadero). Este tipo de dato, es comúnmente usado en condicionales o variables que solo pueden tomar el valor de falso o verdadero. Las variables de tipo bool no suelen llevar modificadores, pues son innecesarios, ya que su rango es solo 0 y 1.\r\n\r\nint: El tipo de dato int, tiene un tamaño de 32 bits y un rango entre -2.147.483.648 y 2.147.483.647. Este tipo de dato, es usado para números enteros (sin cifras decimales). A continuación alguna combinaciones con los modificadores:\r\nshort int: Tiene un tamaño de 16 bits y un rango entre -32.768 y 32.767.\r\nunsigned short int: Tiene un tamaño de 16 bits y un rango entre 0 y 65535.\r\nunsigned int: Tiene un tamaño de 32 bits y un rango entre 0 y 4.294.967.295.\r\nlong long int: Tiene un tamaño de 64 bits y un rango entre -9.223.372.775.808 y 9.223.375.775.807.\r\n\r\nunsigned long long int: Tiene un tamaño de 64 bits y un rango entre 0 y 2exp64.\r\nfloat: El tipo de dato float tiene un tamaño de 32 bits, es usado comúnmente en números con 6 o menos cifras decimales. Tiene un rango entre 1,17549*(e^-38) hasta 3,40282*(e^+38).\r\ndouble: El tipo de dato double tiene un tamaño de 64 bits, es usado para números de menos de 15 cifras decimales. Tiene un rango entre 2,22507*(e^-308) hasta 1,79769*(e^308).\r\n\r\nlong double: Tiene un tamaño de 96 bits y una precisión de 18 cifras decimales. Tiene un rango entre 3,3621*(e^-4932) hasta 1,18973*(e^4932).\r\n\r\nchar: Las variables del tipo char, son digamos las variables problema del lenguaje C y C++, puesto que tienen una gran cantidad de restricciones y complicaciones, bastante molestas. Las variables de tipo char, en C y C++ son consideradas vectores y como quizá sabrás a los vectores se les debe declarar un tamaño máximo, entre corchetes \"[ ]\" lo cual restringe un poco al no saber qué tamaño podría llegar a tener una cadena de caracteres, y aunque hay formas de evadir esto, es bastante complicado. Es recomendable usar las variables de tipo string para las cadenas de caracteres, incluidas en la librería string.h que son bastante fáciles de usar. La sintaxis para declarar un char es la siguiente: char nombre_char[tamañoMax]; o simplemente char nombre = \'valor\' notar que va entre comillas simples.'),
(5, 'variables', 'Un tipo de dato, al que se ha asignado un valor, que puede variar durante la ejecución del programa.\r\nEjemplos:\r\na = 5;\r\nresultado = 75.35;\r\nnombre = «Codigos de Programacion»;\r\nint a = 5;\r\ndouble resultado = 75.35;\r\nchar nombre[20] = \"Codigos de Programacion\";'),
(6, 'Constantes', 'Una constante es un valor que no puede ser alterado/modificado durante la ejecución de un programa, únicamente puede ser leído.\r\nEjemplo:\r\n¶ PI = 3.1416\r\n#define PI 3.141592;'),
(7, 'Entrada de datos', 'La entrada y salida de datos en C++ es simple (al menos para los casos más comunes). Con esto hago una comparación entre C++ y Java, pues leer una entrada del usuario por teclado en C++ es bastante simple mientras que en Java implica una serie de conceptos adicionales que la hacen un tanto más complicada. Por suerte para nosotros en esta sección veremos cómo leer por teclado en C++, en otras palabras, asignar a una variable el valor que el usuario escriba por el teclado. Adicional a esto veremos también cómo mostrar texto por pantalla en C++, es decir, salida de datos.\r\n\r\nVamos a comenzar primero con aprender a mostrar texto por pantalla en C++. Este orden se debe a que cuando queremos pedirle algún dato al usuario primero debemos hacerle saber lo que queremos que ingrese y para hacérselo saber debemos mostrarle un mensaje con las indicaciones, por tal motivo es importante primero saber mostrar texto en pantalla en C++ y luego a leer texto por teclado en C++.'),
(8, 'Salida de datos', 'Mostrar texto por pantalla en C++ es muy simple. Para imprimir una salida de texto en C++ se hace uso de la instrucción cout, junto con <<. Es importante tener en cuenta que la instrucción cout siempre va acompañada de << para controlar el flujo de datos que sale. No te fijes mucho en ellos, solo ten siempre presente que cout viene acompañado de \"<<\"'),
(9, 'Condicionales', 'Los condicionales en C++, son una estructura de control esencial al momento de programar y aprender a programar. Tanto C como C++ y la mayoría de los lenguajes de programación utilizados actualmente, nos permiten hacer uso de estas estructuras parea definir ciertas acciones condiciones especificas en nuestro algoritmo. Un condicional, permite establecer una serie de condiciones al interior de nuestro programa, que nos ayudan a determinar que acciones llevará cabo dadas ciertas circunstancias, por ejemplo si queremos decidir cuándo dar acceso a un usuario, dependiendo de si el nombre de usuario y contraseña son correctos, para algo como esto, es útil un condicional, nos permite verificar si determinada condición se cumple (en este caso si la contraseña y el nombre de usuario son correctos) y de acuerdo a que se cumpla o no, llevar a cabo un conjunto de acciones. Los condicionales aumentan la \"expresividad\" de un software, es decir nos permiten considerar diferentes situaciones con antelación, evitando o permitiendo sortear diferentes tipos de situaciones que son del interés de nuestra aplicación.'),
(10, 'Condicional IF', 'Los condicionales if, son una estructura de control condicional, también llamadas estructuras selectivas de casos simples (porque solo definen un posible flujo), lad cuales nos permiten tomar cierta decisión al interior de nuestro algoritmo, es decir, nos permiten determinar qué acciones ejecutar según cierta condición sea verdadera, por ejemplo determinar si un número cualquiera es mayor que 10 y de acuerdo a esto mostrar un mensaje (o cualquier acción que sea necesaria).\r\n\r\nBásicamente, un condicional if, es una estructura que nos posibilita definir las acciones a ejecutar si se cumple cierta condición y de ese modo modificar la ejecución de tareas en un programa según se necesite.\r\n¿Cómo funciona un Condicional If?\r\nPara comprender mejor cómo funciona el condicional if, una muy buena forma es partiendo de un ejemplo. Supongamos que queremos verificar si el resultado de una suma ingresada por el usuario es correcto o no. Para este ejemplo, el condicional if, es el encargado de verificar si el resultado ingresado corresponde o no a la respuesta correcta de la suma. El condicional if, funciona verificando la condición ingresada y de acuerdo a su valor de verdad (falso o verdadero) lleva a cabo o no una serie de instrucciones.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puntuacion`
--

CREATE TABLE `puntuacion` (
  `id_puntuacion` int(11) NOT NULL,
  `id_estudiante` int(11) NOT NULL,
  `id_ejercicio` int(11) NOT NULL,
  `puntuacion` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `puntuacion`
--

INSERT INTO `puntuacion` (`id_puntuacion`, `id_estudiante`, `id_ejercicio`, `puntuacion`) VALUES
(4, 3, 1, '4');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id_rol` int(11) NOT NULL,
  `no_rol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usario`
--

CREATE TABLE `usario` (
  `id_usuario` int(11) NOT NULL,
  `nombre_usuario` varchar(40) NOT NULL,
  `apellido_usuario` varchar(30) NOT NULL,
  `email_usuario` varchar(30) NOT NULL,
  `pass_usuario` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usario`
--

INSERT INTO `usario` (`id_usuario`, `nombre_usuario`, `apellido_usuario`, `email_usuario`, `pass_usuario`) VALUES
(3, 'Brenda Ximena', 'Rios Ropero', 'est_bx_rios@fesc.edu.co', '123'),
(4, 'Eduar xavier', 'avendaño serrano', 'e', '123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ejercicio`
--
ALTER TABLE `ejercicio`
  ADD PRIMARY KEY (`id_ejercicio`);

--
-- Indices de la tabla `informacion`
--
ALTER TABLE `informacion`
  ADD PRIMARY KEY (`id_informacion`);

--
-- Indices de la tabla `puntuacion`
--
ALTER TABLE `puntuacion`
  ADD PRIMARY KEY (`id_puntuacion`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indices de la tabla `usario`
--
ALTER TABLE `usario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ejercicio`
--
ALTER TABLE `ejercicio`
  MODIFY `id_ejercicio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `informacion`
--
ALTER TABLE `informacion`
  MODIFY `id_informacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `puntuacion`
--
ALTER TABLE `puntuacion`
  MODIFY `id_puntuacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id_rol` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usario`
--
ALTER TABLE `usario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ejercicio`
--
ALTER TABLE `ejercicio`
  ADD CONSTRAINT `ejercicio_ibfk_1` FOREIGN KEY (`id_ejercicio`) REFERENCES `puntuacion` (`id_ejercicio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
