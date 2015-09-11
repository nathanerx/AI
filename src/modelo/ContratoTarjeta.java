package modelo;

import java.util.Date;

import controlador.ViewMedioPago;

public class ContratoTarjeta extends Contrato
{
	private MedioPago	medioPago;

	public ContratoTarjeta(Cliente cliente, Date ingreso, Date egreso)
	{
		super(cliente, ingreso, egreso);
		medioPago = null;
	}

	public ViewMedioPago asignarMedioPago(EntidadEmisoraTarjeta entidad, int nro, Date venc)
	{
		return null;
	}

	public ViewMedioPago asignarMedioPago()
	{
		return null;
	}

	public MedioPago getMedioPago()
	{
		return medioPago;
	}

	public void setMedioPago(MedioPago medioPago)
	{
		this.medioPago = medioPago;
	}
}
