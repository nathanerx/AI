package modelo;

import java.util.Date;

import controlador.ViewCuentaCorriente;

public class CuentaCorriente
{
	private int			numeroCuota;
	private float		importe;
	private Date		fechaVencimiento;
	private Date		fechaPago;
	private MedioPago	medioPago;

	public boolean estasPorVencer()
	{
		return false;
	}

	public boolean estasVencida()
	{
		return false;
	}

	public ViewCuentaCorriente mostrate()
	{
		return null;
	}

	public CuentaCorriente(int nroCuota, float importe, Date vencimiento)
	{
	}

	public int getNumeroCuota()
	{
		return numeroCuota;
	}

	public void setNumeroCuota(int numeroCuota)
	{
		this.numeroCuota = numeroCuota;
	}

	public float getImporte()
	{
		return importe;
	}

	public void setImporte(float importe)
	{
		this.importe = importe;
	}

	public Date getFechaVencimiento()
	{
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento)
	{
		this.fechaVencimiento = fechaVencimiento;
	}

	public Date getFechaPago()
	{
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago)
	{
		this.fechaPago = fechaPago;
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
