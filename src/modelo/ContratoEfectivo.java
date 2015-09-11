package modelo;

import java.util.Date;

import controlador.ViewMedioPago;

public class ContratoEfectivo extends Contrato
{
	public ContratoEfectivo(Cliente cliente, Date ingreso, Date egreso)
	{
		super(cliente, ingreso, egreso);
		// TODO Auto-generated constructor stub
	}

	public ViewMedioPago asignarMedioPago()
	{
		return null;

	}
}
