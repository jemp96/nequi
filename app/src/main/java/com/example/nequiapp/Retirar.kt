package com.example.nequiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Retirar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retirar)
        val cantidad = findViewById<EditText>(R.id.cantidadRetirar)
        val codigo = findViewById<EditText>(R.id.codigoRetirar)
        val button=findViewById<Button>(R.id.btnsalir)
        val botonRetirar = findViewById<Button>(R.id.idRetirar)
        botonRetirar.setOnClickListener {
            if(!(cantidad.text.toString().isNullOrEmpty() && codigo.text.toString().isNullOrEmpty())){
                if(codigo.text.toString() == GlobalData.codigoGenerado) {
                    val cantidadValue = cantidad.text.toString().toInt()
                    if(cantidadValue>=10000){
                        Log.d("MiTag", cantidadValue.toString())
                        Log.d("MiTag", GlobalData.saldo.toString())
                        if(cantidadValue.toString().isNotEmpty()){
                            if(cantidadValue<=GlobalData.saldo){
                                GlobalData.saldo -= cantidadValue;
                                Toast.makeText(this, "Retiro exitoso", Toast.LENGTH_LONG).show()
                                val actividadPrincipal = Intent(this, CodigoAcceso::class.java)
                                startActivity(actividadPrincipal)



                            }else{
                                Log.d("MiTag", cantidadValue.toString())
                                Toast.makeText(this,"Saldo insuficiente", Toast.LENGTH_LONG).show()
                            }

                        }else{
                            Toast.makeText(this,"La app no funciona", Toast.LENGTH_LONG).show()
                        }

                    }else{
                        Toast.makeText(this,"El minimo de retiro es de 10.000 pesos", Toast.LENGTH_LONG).show()

                    }

                }else{
                    Log.d("codigoGlobal",GlobalData.codigoGenerado)
                    Toast.makeText(this,"El codigo que ingresaste no es correcto", Toast.LENGTH_LONG).show()
                }

            }


            }
        button.setOnClickListener{
            val lanzar = Intent(this,CodigoAcceso::class.java)
            startActivity(lanzar)

        }

            }
        }













