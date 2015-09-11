package modelo;

import java.util.Date;

import controlador.ViewMedioPago;

public class ContratoCheque extends Contrato
{
	public ContratoCheque(Cliente cliente, Date ingreso, Date egreso)
	{
		super(cliente, egreso, egreso);
	}

	public void Contrato(Cliente cliente, Date ingreso, Date egreso)
	{

	}

	public ViewMedioPago asignarMedioPago()
	{
		return null;

	}
}
