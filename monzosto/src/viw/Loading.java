package viw;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.Color;

public class Loading {

	private  JProgressBar loadingBar_1;
	private JFrame frame;
	private JLabel porcentagem;
	

	public JProgressBar getLoadingBar_1() {
		return loadingBar_1;
	}

	public void setLoadingBar_1(JProgressBar loadingBar_1) {
		this.loadingBar_1 = loadingBar_1;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(JLabel porcentagem) {
		this.porcentagem = porcentagem;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loading window = new Loading();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Loading loading = new Loading();
		loading.setVisible(true);
		
		try {
			
			for (int i = 0; i < 101; i++) {
				Thread.sleep(1000);
				loading.porcentagem.setText(i + "%");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}


	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Create the application.
	 */
	public Loading() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =  new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 502, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JProgressBar loadingBar_1 = new JProgressBar();
		loadingBar_1.setBounds(91, 424, 318, 14);
		frame.getContentPane().add(loadingBar_1);
		
		JLabel lblLoading = new JLabel("Loading...");
		lblLoading.setForeground(Color.ORANGE);
		lblLoading.setFont(new Font("Arial", Font.PLAIN, 15));
		lblLoading.setBounds(10, 418, 100, 20);
		frame.getContentPane().add(lblLoading);
		
		JLabel porcentagem = new JLabel("0 %");
		porcentagem.setForeground(Color.ORANGE);
		porcentagem.setFont(new Font("Arial", Font.PLAIN, 15));
		porcentagem.setBounds(451, 418, 41, 20);
		frame.getContentPane().add(porcentagem);
		
		JLabel backgraundLoading = new JLabel("");
		backgraundLoading.setIcon(new ImageIcon("C:\\Users\\diego\\Desktop\\Sem T\u00EDtulo-2.png"));
		backgraundLoading.setAlignmentX(0.5f);
		backgraundLoading.setBounds(0, 0, 501, 449);
		frame.getContentPane().add(backgraundLoading);
		
	}
	
}
