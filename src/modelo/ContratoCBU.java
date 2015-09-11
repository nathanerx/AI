package modelo;

import java.util.Date;

import controlador.ViewMedioPago;

public class ContratoCBU extends Contrato
{
	private MedioPago	medioPago;

	public ViewMedioPago asignarMedioPago(EntidadEmisoraTarjeta entidad, int nro)
	{
		return null;

	}

	public ContratoCBU(Cliente cliente, Date ingreso, Date egreso)
	{
		super(cliente, egreso, egreso);
		medioPago = null;
	}

	public void Contrato(Cliente cliente, Date ingreso, Date egreso)
	{

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
