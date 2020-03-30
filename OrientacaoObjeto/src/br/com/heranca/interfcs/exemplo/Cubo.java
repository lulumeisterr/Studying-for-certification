package br.com.heranca.interfcs.exemplo;

import br.com.enums.interfaces.IQuadrado;
import br.com.enums.interfaces.IVolumeCalculavel;

/**
 * Herança Multipla
 * 
 * @author lrodrina
 *
 */
public class Cubo implements IVolumeCalculavel , IQuadrado{

	double lado;
	public Cubo(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double caculaVolume() {
		// TODO Auto-generated method stub
		return 6 * lado * lado;
	}

	@Override
	public double calcularAreaQuadrado() {
		// TODO Auto-generated method stub
		return lado * lado * lado;
	}

}
