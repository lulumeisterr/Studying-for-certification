package br.com.heranca.interfcs.exemplo;

import br.com.enums.interfaces.IQuadrado;
import br.com.enums.interfaces.IVolumeCalculavel;

public class Quadrado implements IQuadrado , IVolumeCalculavel {

	private double lado;
	
	public Quadrado (){
		
	}
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularAreaQuadrado() {
		return lado * lado;
	}
	
	@Override
	public double caculaVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
