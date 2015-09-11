package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class Menu extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private JMenuBar jMenuBar1;
	private JMenu jMenuAdministracion;

	private JMenu jMenuClientes;
	private JMenuItem jMenuAltaCliente;
	private JMenuItem jMenuModificacionCliente;
	private JMenuItem jMenuBajaCliente;

	private JMenu jMenuMediosDePago;
	private JMenuItem jMenuAltaMedioDePago;
	private JMenuItem jMenuBajaMedioDePago;

	private JMenu jMenuAbonos;
	private JMenuItem jMenuAltaAbonos;
	private JMenuItem jMenuBajaAbonos;
	private JMenuItem jMenuModificacionAbonos;

	private JMenu jMenuContratos;
	private JMenuItem jMenuAltaContratos;
	private JMenuItem jMenuBajaContratos;
	private JMenuItem jMenuModificacionContratos;

	private JMenu jMenuMapaCocheras;
	private JMenuItem jMenuDisponibilidadCocheras;

	private JMenu jMenuSalir;
	private JMenuItem jMenuItemSalir;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Menu inst = new Menu();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public Menu() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setPreferredSize(new java.awt.Dimension(800, 600));
			this.setTitle("Sistema de Administracion de Cocheras");
			JFrame.setDefaultLookAndFeelDecorated(true);
			this.setMinimumSize(new java.awt.Dimension(800, 600));
			this.setResizable(false);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenuAdministracion = new JMenu();
					jMenuBar1.add(jMenuAdministracion);
					jMenuAdministracion.setText("Administracion");
					{
						// CLIENTES
						jMenuClientes = new JMenu();
						jMenuAdministracion.add(jMenuClientes);
						jMenuClientes.setText("Clientes");
						jMenuClientes.setBounds(39, 0, 57, 23);
						{
							jMenuAltaCliente = new JMenuItem();
							jMenuClientes.add(jMenuAltaCliente);
							jMenuAltaCliente.setText("Alta");
							jMenuAltaCliente
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
										}
									});
						}
						{
							jMenuModificacionCliente = new JMenuItem();
							jMenuClientes.add(jMenuModificacionCliente);
							jMenuModificacionCliente.setText("Modificación");
							jMenuModificacionCliente
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											System.out
													.println("jMenuItem2.actionPerformed, event="
															+ evt);
											// TODO add your code for
											// jMenuItem2.actionPerformed
										}
									});
						}
						{
							jMenuBajaCliente = new JMenuItem();
							jMenuClientes.add(jMenuBajaCliente);
							jMenuBajaCliente.setText("Baja");
							jMenuBajaCliente
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
										}
									});
						}
						// MEDIOS DE PAGO
						jMenuMediosDePago = new JMenu();
						jMenuAdministracion.add(jMenuMediosDePago);
						jMenuMediosDePago.setText("Medios de Pago");
						jMenuMediosDePago.setBounds(39, 0, 57, 23);
						{
							jMenuAltaMedioDePago = new JMenuItem();
							jMenuMediosDePago.add(jMenuAltaMedioDePago);
							jMenuAltaMedioDePago.setText("Alta");
							jMenuAltaMedioDePago
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
										}
									});
						}
						{
							jMenuBajaMedioDePago = new JMenuItem();
							jMenuMediosDePago.add(jMenuBajaMedioDePago);
							jMenuBajaMedioDePago.setText("Baja");
							jMenuBajaMedioDePago
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
										}
									});
						}
						// ABONOS
						jMenuAbonos = new JMenu();
						jMenuAdministracion.add(jMenuAbonos);
						jMenuAbonos.setText("Abonos");
						jMenuAbonos.setBounds(39, 0, 57, 23);
						{
							jMenuAltaAbonos = new JMenuItem();
							jMenuAbonos.add(jMenuAltaAbonos);
							jMenuAltaAbonos.setText("Alta");
							jMenuAltaAbonos
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
										}
									});
						}
						{
							jMenuBajaAbonos = new JMenuItem();
							jMenuAbonos.add(jMenuBajaAbonos);
							jMenuBajaAbonos.setText("Baja");
							jMenuBajaAbonos
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
										}
									});
						}
						{
							jMenuModificacionAbonos = new JMenuItem();
							jMenuAbonos.add(jMenuModificacionAbonos);
							jMenuModificacionAbonos.setText("Modificación");
							jMenuModificacionAbonos
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
										}
									});
						}
						// CONTRATOS
						jMenuContratos = new JMenu();
						jMenuAdministracion.add(jMenuContratos);
						jMenuContratos.setText("Contratos");
						jMenuContratos.setBounds(39, 0, 57, 23);
						{
							jMenuAltaContratos = new JMenuItem();
							jMenuContratos.add(jMenuAltaContratos);
							jMenuAltaContratos.setText("Alta");
							jMenuAltaContratos
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
										}
									});
						}
						{
							jMenuBajaContratos = new JMenuItem();
							jMenuContratos.add(jMenuBajaContratos);
							jMenuBajaContratos.setText("Baja");
							jMenuBajaContratos
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
										}
									});
						}
						{
							jMenuModificacionContratos = new JMenuItem();
							jMenuContratos.add(jMenuModificacionContratos);
							jMenuModificacionContratos.setText("Modificación");
							jMenuModificacionContratos
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
										}
									});
						}
						// MAPA COCHERAS
						jMenuMapaCocheras = new JMenu();
						jMenuAdministracion.add(jMenuMapaCocheras);
						jMenuMapaCocheras.setText("Mapa de Cocheras");
						jMenuMapaCocheras.setBounds(39, 0, 57, 23);
						{
							jMenuDisponibilidadCocheras = new JMenuItem();
							jMenuMapaCocheras.add(jMenuDisponibilidadCocheras);
							jMenuDisponibilidadCocheras
									.setText("Disponibilidad");
							jMenuDisponibilidadCocheras
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
										}
									});
						}

					}
				}
				{
					jMenuSalir = new JMenu();
					jMenuBar1.add(jMenuSalir);
					jMenuSalir.setText("Salir del Sistema");
					{
						jMenuItemSalir = new JMenuItem();
						jMenuSalir.add(jMenuItemSalir);
						jMenuItemSalir.setText("Salir");
						jMenuItemSalir.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.exit(0);
							}
						});
					}
				}
			}
			pack();
			this.setSize(800, 600);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
