//  componentes
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

// Hace la imporatacion de ejemplo componente llamada del archivo ejemplo componentes.ts
import { EjemploComponent } from './ejemplo.componente';

@NgModule({
  declarations: [
    AppComponent,
    EjemploComponent // aca coloco el nombre de la clase y se impota arriba por defecto
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
