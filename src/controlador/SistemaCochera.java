package controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import modelo.Abono;
import modelo.Cliente;
import modelo.Cochera;
import modelo.Contrato;
import modelo.ContratoCBU;
import modelo.ContratoCheque;
import modelo.ContratoEfectivo;
import modelo.ContratoTarjeta;
import modelo.EntidadBancaria;
import modelo.EntidadEmisoraTarjeta;
import modelo.MedioPago;

public class SistemaCochera
{
	private List<Cliente>				clientes;
	private List<Abono>					abonos;
	private List<MedioPago>				mediosPago;
	private List<Cochera>				cocheras;
	private List<Contrato>				contratos;
	private Cliente						clienteActual;
	private Contrato					contratoActual;
	private int							cocheraPosible;
	private List<EntidadBancaria>		bancos;
	private List<EntidadEmisoraTarjeta>	tarjeteros;

	private static SistemaCochera		instancia;

	public static SistemaCochera getInstance()
	{
		if (instancia == null)
			instancia = new SistemaCochera();
		return instancia;
	}

	private SistemaCochera()
	{
		// CARGAR TODOS LOS OBJETOS DESDE LA BASE DE DATOS
		// CUANDO SE INICIALIZA LA INSTANCIA

		clientes = new ArrayList<Cliente>();
		abonos = new ArrayList<Abono>();
		mediosPago = new ArrayList<MedioPago>();
		cocheras = new ArrayList<Cochera>();
		bancos = new ArrayList<EntidadBancaria>();
		tarjeteros = new ArrayList<EntidadEmisoraTarjeta>();
		contratos = new ArrayList<Contrato>();
	}

	public void crearCliente(int dni, String nombre, String domicilio, String Telefono, String mail)
	{
		if (this.buscarCliente(dni) == null)
		{
			clientes.add(new Cliente(dni, nombre, domicilio, Telefono, mail));
		}
	}

	public ViewCliente mostrarCliente(int dni)
	{
		Cliente clienteBusqueda = this.buscarCliente(dni);
		ViewCliente vistaCliente = null;

		if (clienteBusqueda != null)
		{
			this.setClienteActual(clienteBusqueda);
			vistaCliente = this.getClienteActual().verCliente();
		}
		return vistaCliente;
	}

	public List<ViewCliente> listarClientes(String clave)
	{
		return this.buscarClienteComo(clave);
	}

	public void editarCliente(String nombre, String domicilio, String Telefono, String mail)
	{
		if (clienteActual != null)
		{
			clienteActual.editarme(nombre, domicilio, Telefono, mail);
		}
	}

	public void eliminarCliente()
	{
		if (clienteActual != null)
		{
			clienteActual.bajarme();
		}
	}

	public Cliente buscarCliente(int dni)
	{
		for (Cliente cb : this.clientes)
		{
			if (cb.sosCliente(dni))
				return cb;
		}
		return null;
	}

	public List<ViewCliente> buscarClienteComo(String clave)
	{
		List<ViewCliente> clientesEncontrados = new ArrayList<ViewCliente>();

		for (Cliente c : clientes)
		{
			if (c.tePareces(clave))
			{
				clientesEncontrados.add(c.verCliente());
			}
		}
		return clientesEncontrados;
	}

	public void buscarVehiculo(String patente)
	{

	}

	public ViewVehiculo altaVehiculo(String patente, String marca, String modelo, Date fechaEntrada)
	{
		return null;
	}

	public void bajaVehiculo(String patente)
	{

	}

	public ViewCochera asignarCocheraSimple()
	{
		return null;
	}

	public ViewCochera asignarCocheraDobel()
	{
		return null;
	}

	public Cochera buscarCochera(String codigo)
	{
		return null;
	}

	public Vector<ViewBanco> listarBancos()
	{
		return null;
	}

	public Vector<ViewTarjetero> listarTarjeteros()
	{
		return null;
	}

	public ViewMedioPago altaMedioPagoTarjeta(int nroEntidad, int nroTarjeta, Date venc)
	{
		return null;
	}

	public ViewMedioPago altaMedioPagoCBU(int nroEntidad, int nroTarjeta)
	{
		return null;
	}

	public EntidadEmisoraTarjeta buscarTarjetero(int nroEntidad)
	{
		return null;
	}

	public EntidadBancaria buscarBanco(int nroEntidad)
	{
		return null;
	}

	public void altaAbono(int desde, int hasta, float monto)
	{

	}

	public Vector<ViewAbono> listarAbonos()
	{
		return null;
	}

	public ViewAbono mostrarAbono(String codigo)
	{
		return null;
	}

	public void editarAbono(String codigo, int desde, int hasta, float monto)
	{

	}

	public void bajaAbono(String codigo)
	{

	}

	public Abono buscarAbono(String codigo)
	{
		return null;
	}

	public boolean nuevoContratoEfectivo(int dni, Date ingreso, Date egreso)
	{
		Cliente ca;
		ca = this.buscarCliente(dni);
		if (ca != null)
		{
			Contrato nc = new ContratoEfectivo(ca, ingreso, egreso);
			setContratoActual(nc);
			return true;
		} else
			return false;
	}

	public boolean nuevoContratoCheque(int dni, Date ingreso, Date egreso)
	{

		Cliente ca;
		ca = this.buscarCliente(dni);
		if (ca != null)
		{
			Contrato nc = new ContratoCheque(ca, ingreso, egreso);
			setContratoActual(nc);
			return true;
		} else
			return false;
	}

	public boolean nuevoContratoCBU(int dni, Date ingreso, Date egreso)
	{
		Cliente ca;
		ca = this.buscarCliente(dni);
		if (ca != null)
		{
			Contrato nc = new ContratoCBU(ca, ingreso, egreso);
			setContratoActual(nc);
			return true;
		} else
			return false;

	}

	public boolean nuevoContratoTarjeta(int dni, Date ingreso, Date egreso)
	{
		Cliente ca;
		ca = this.buscarCliente(dni);
		if (ca != null)
		{
			Contrato nc = new ContratoTarjeta(ca, ingreso, egreso);
			setContratoActual(nc);
			return true;
		} else
			return false;

	}

	public void editarContrato(int nroContrato)
	{
		Contrato ec;
		ec = this.buscarContrato(nroContrato);
		if (ec != null)
			this.setContratoActual(ec);

	}

	public Contrato buscarContrato(int nroContrato)
	{
		for (Contrato cb : contratos)
		{
			if (cb.sosContrato(nroContrato))
				return cb;
		}
		return null;

	}

	public Vector<ViewContrato> listarContratos(String Clave)
	{
		return null;
	}

	public ViewContrato verContrato(int nroContrato)
	{
		return null;
	}

	public int cerrarContrato()
	{
		float importe = 0;
		if (this.contratoActual != null)
		{
			if (contratoActual.tenesCliente())
				if (contratoActual.tenesMedioPago())
					if (contratoActual.autosYCocherasiguales())
					{
						int cantautos = contratoActual.contarAutos();
						int nrodias = contratoActual.cantDias();

						for (Abono ab : abonos)
						{
							if (ab.aplicas(nrodias))
								importe = ab.calcularImporte(cantautos, nrodias);
						}
						contratoActual.crearCuentaCorriente(importe);

					}
			contratos.add(contratoActual);
			return contratoActual.getNroContrato();
		}
		return -1;
	}

	public void bajaContrato(int nroContrato)
	{
		Contrato bc;
		bc = this.buscarContrato(nroContrato);
		if (bc != null)
			bc.bajarme();

	}

	public Vector<ViewCuentaCorriente> mostrarCuentaCorriente()
	{
		return null;
	}

	public ViewMedioPago mostrarmedioPagocontrato()
	{
		return null;
	}

	public Vector<ViewCochera> mostrarCocherasContrato()
	{
		return null;
	}

	public Vector<ViewVehiculo> mostrarVehiculosContrato()
	{
		return null;
	}

	public List<Cliente> getClientes()
	{
		return clientes;
	}

	public void setClientes(List<Cliente> clientes)
	{
		this.clientes = clientes;
	}

	public List<Abono> getAbonos()
	{
		return abonos;
	}

	public void setAbonos(List<Abono> abonos)
	{
		this.abonos = abonos;
	}

	public List<MedioPago> getMediosPago()
	{
		return mediosPago;
	}

	public void setMediosPago(List<MedioPago> mediosPago)
	{
		this.mediosPago = mediosPago;
	}

	public List<Cochera> getCocheras()
	{
		return cocheras;
	}

	public void setCocheras(List<Cochera> cocheras)
	{
		this.cocheras = cocheras;
	}

	public Cliente getClienteActual()
	{
		return clienteActual;
	}

	public void setClienteActual(Cliente clienteActual)
	{
		this.clienteActual = clienteActual;
	}

	public Contrato getContratoActual()
	{
		return contratoActual;
	}

	public void setContratoActual(Contrato contratoActual)
	{
		this.contratoActual = contratoActual;
	}

	public int getCocheraPosible()
	{
		return cocheraPosible;
	}

	public void setCocheraPosible(int cocheraPosible)
	{
		this.cocheraPosible = cocheraPosible;
	}

	public List<EntidadBancaria> getBancos()
	{
		return bancos;
	}

	public void setBancos(List<EntidadBancaria> bancos)
	{
		this.bancos = bancos;
	}

	public List<EntidadEmisoraTarjeta> getTarjeteros()
	{
		return tarjeteros;
	}

	public void setTarjeteros(List<EntidadEmisoraTarjeta> tarjeteros)
	{
		this.tarjeteros = tarjeteros;
	}

}
