package modelo;

import java.util.Date;

import controlador.ViewMedioPago;


public class TarjetaCredito extends MedioPago {
	private EntidadEmisoraTarjeta entidadEmisora;
	private int numero;
	private Date fechaVencimiento;
	public ViewMedioPago mostrate(String detalle) {
		return null;
	
	}
	
	public void MedioPago(EntidadEmisoraTarjeta entidad, int nro, Date venc) {
	
	}
	
	public ViewMedioPago mostrate() {
		return null;
	
	}
	
	public void MedioPago() {
	
	}

	public EntidadEmisoraTarjeta getEntidadEmisora()
	{
		return entidadEmisora;
	}

	public void setEntidadEmisora(EntidadEmisoraTarjeta entidadEmisora)
	{
		this.entidadEmisora = entidadEmisora;
	}

	public int getNumero()
	{
		return numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public Date getFechaVencimiento()
	{
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento)
	{
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
}
