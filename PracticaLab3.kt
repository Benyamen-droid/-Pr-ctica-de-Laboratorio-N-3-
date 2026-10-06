package com.example.myapplication01

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

/*
 * Práctica de Laboratorio N° 3 - SIS 227 Desarrollo de Plataformas II
 */

// ---------------------------------------------------------------
// Ejercicio 1
// --------------------------------------------------------------
@Preview(showBackground = true)
@Composable
fun ConstraintEjercicio_1() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta, boxYellow, boxGreen) = createRefs()

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
        )
        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    bottom.linkTo(boxRed.top)
                    end.linkTo(boxRed.start)
                }
        )
        // Arriba-derecha
        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    bottom.linkTo(boxRed.top)
                    start.linkTo(boxRed.end)
                }
        )
        // Abajo-izquierda
        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    top.linkTo(boxRed.bottom)
                    end.linkTo(boxRed.start)
                }
        )
        // Abajo-derecha
        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    top.linkTo(boxRed.bottom)
                    start.linkTo(boxRed.end)
                }
        )
    }
}

// --------------------------------------------------------------
// Ejercicio 2
// -------------------------------------------------------------
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ConstraintEjercicio_2() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (red, blue, yellow, green, magenta, cyan, black) = createRefs()
        val s = 120.dp

        Box(
            Modifier.size(s).background(Color.Red).constrainAs(red) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            }
        )
        Box(
            Modifier.size(s).background(Color.Blue).constrainAs(blue) {
                bottom.linkTo(red.top)
                end.linkTo(red.start)
            }
        )
        Box(
            Modifier.size(s).background(Color.Yellow).constrainAs(yellow) {
                bottom.linkTo(red.top)
                start.linkTo(red.end)
            }
        )
        Box(
            Modifier.size(s).background(Color.Green).constrainAs(green) {
                bottom.linkTo(blue.top)
                start.linkTo(red.start)
                end.linkTo(red.end)
            }
        )
        Box(
            Modifier.size(s).background(Color.Magenta).constrainAs(magenta) {
                top.linkTo(red.bottom)
                end.linkTo(red.start)
            }
        )
        Box(
            Modifier.size(s).background(Color.Cyan).constrainAs(cyan) {
                top.linkTo(red.bottom)
                start.linkTo(red.end)
            }
        )
        Box(
            Modifier.size(s).background(Color.Black).constrainAs(black) {
                top.linkTo(magenta.bottom)
                start.linkTo(red.start)
                end.linkTo(red.end)
            }
        )
    }
}

// ---------------------------------------------------------------
// Ejercicio 3
// --------------------------------------------------------------
@Preview(showBackground = true)
@Composable
fun ConstraintEjercicio_3() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (red, blue, magenta, yellow, green, cyan, black1, black2) = createRefs()
        val big = 120.dp
        val small = 40.dp

        Box(
            Modifier.size(big).background(Color.Red).constrainAs(red) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            }
        )
        Box(
            Modifier.size(big).background(Color.Blue).constrainAs(blue) {
                bottom.linkTo(red.top)
                end.linkTo(red.start)
            }
        )
        Box(
            Modifier.size(big).background(Color.Magenta).constrainAs(magenta) {
                bottom.linkTo(red.top)
                start.linkTo(red.end)
            }
        )
        Box(
            Modifier.size(big).background(Color.Yellow).constrainAs(yellow) {
                top.linkTo(red.bottom)
                end.linkTo(red.start)
            }
        )
        Box(
            Modifier.size(big).background(Color.Green).constrainAs(green) {
                top.linkTo(red.bottom)
                start.linkTo(red.end)
            }
        )
        Box(
            Modifier.size(small).background(Color.Cyan).constrainAs(cyan) {
                start.linkTo(blue.end)
                bottom.linkTo(blue.bottom)
            }
        )
        Box(
            Modifier.size(small).background(Color.Black).constrainAs(black1) {
                start.linkTo(cyan.end)
                bottom.linkTo(cyan.top)
            }
        )
        Box(
            Modifier.size(small).background(Color.Black).constrainAs(black2) {
                start.linkTo(black1.end)
                bottom.linkTo(black1.top)
            }
        )
    }
}
