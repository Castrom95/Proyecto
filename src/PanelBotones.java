

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * Panel donde se encuentran los botones principales de la aplicación.
 */
@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Comando para agregar un equipo.
     */
    private static final String ASIGNAR_SILLA = "AsignarSilla";

    /**
     * Comando para agregar un jugador.
     */
    private static final String AGREGAR_CLIENTE = "AgregarCliente";

    /**
     * Comando para calcular el valor de la nómina de un equipo.
     */
    private static final String ASIGNAR_UNA_SILLA = "AsignarUnaSilla";

    /**
     * Comando para actualizar las fichas técnicas.
     */
    private static final String A = "A";

    /**
     * Comando Opción 1.
     */
    private static final String OPCION_1 = "OPCION_1";

    /**
     * Comando Opción 2.
     */
    private static final String OPCION_2 = "OPCION_2";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicación.
     */
    private FramePrincipal principal;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Es el botón para agregar un equipo.
     */
    private JButton boton1;

    /**
     * Es el botón para agregar un jugador.
     */
    private JButton boton2;

    /**
     * Es el botón para calcular la nómina de un equipo.
     */
    private JButton boton3;

    /**
     * Es el botón para actualizar fichas técnicas.
     */
    private JButton btn4;

    /**
     * Botón Opción 1.
     */
    private JButton botonOpcion1;

    /**
     * Botón Opción 2.
     */
    private JButton botonOpcion2;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel.
     * @param ventana Ventana principal - ventana!=null.
     */
    public PanelBotones( FramePrincipal ventana )
    {
        principal = ventana;
        setBorder( new CompoundBorder( new EmptyBorder( 5, 5, 5, 5 ), new TitledBorder( "Opciones" ) ) );
        setLayout( new GridLayout( 2, 3, 3, 3 ) );

        // Botón agregar equipos
        boton1 = new JButton( "Asignar Silla" );
        boton1.setActionCommand( ASIGNAR_SILLA );
        boton1.addActionListener( this );
        add( boton1 );

        // Botón agregar jugador
        boton2 = new JButton( "Agregar cliente" );
        boton2.setActionCommand( AGREGAR_CLIENTE );
        boton2.addActionListener( this );
        add( boton2 );

        // Botón calcular nómina
        boton3 = new JButton( "Asignar una Silla" );
        boton3.setActionCommand( ASIGNAR_UNA_SILLA );
        boton3.addActionListener( this );
        add( boton3 );

        // Botón actualizar fichas técnicas
        btn4 = new JButton( "" );
        btn4.setActionCommand( A );
        btn4.addActionListener( this );
        add( btn4 );

        // Botón opción 1
        botonOpcion1 = new JButton( "Opción 1" );
        botonOpcion1.setActionCommand( OPCION_1 );
        botonOpcion1.addActionListener( this );
        add( botonOpcion1 );

        // Botón opción 2
        botonOpcion2 = new JButton( "Opción 2" );
        botonOpcion2.setActionCommand( OPCION_2 );
        botonOpcion2.addActionListener( this );
        add( botonOpcion2 );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Manejo de los eventos de los botones.
     * @param evento Acción que generó el evento - evento!=null.
     */
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( ASIGNAR_SILLA.equals( comando ) )
        {
        }
        else if( AGREGAR_CLIENTE.equals( comando ) )
        {
        }
        else if( ASIGNAR_UNA_SILLA.equals( comando ) )
        {
        }
        else if( A.equals( comando ) )
        {
        }
        else if( OPCION_1.equals( comando ) )
        {
        }
        else if( OPCION_2.equals( comando ) )
        {
        	
        }
    }

}
