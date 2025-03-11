/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230215_if.c_kuis;

/**
 *
 * @author Lab Informatika
 */
public class Login     public void actionPerformed(ActionEvent e) {
	boolean tombolReset;
        if (e.getSource() == tombolReset) {
            inputUsername.setText("");
            inputPassword.setText("");
        } else if (e.getSource() == tombolLogin) {
            try {
                String username = inputUsername.getText();
                String password = new String(inputPassword.getPassword());

                if (username.isEmpty() && password.isEmpty()) {
                    throw new Exception("Username dan Password Belum Diisi");
                } else if (username.isEmpty()) {
                    throw new Exception("Username belum diisi");
                } else if (password.isEmpty()) {
                    throw new Exception("Password belum diisi");
                }

                // Validasi login
                if (username.equals(USERNAME_VALID) && password.equals(PASSWORD_VALID)) {
                    Session.setUsername(username);
                    new HalamanUtama();
                    this.dispose();
                } else {
                    throw new Exception("Username atau Password salah");
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(this, error.getMessage());
            }
        }
    }
}

	
}
