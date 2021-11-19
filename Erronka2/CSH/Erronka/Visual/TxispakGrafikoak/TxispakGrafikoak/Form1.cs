using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TxispakGrafikoak
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

            this.CenterToScreen();

            // TODO: esta línea de código carga datos en la tabla 'txispakDataSet.Salmentak' Puede moverla o quitarla según sea necesario.
            this.salmentakTableAdapter.Fill(this.txispakDataSet.Salmentak);
            // TODO: esta línea de código carga datos en la tabla 'txispakDataSet.Produktuak' Puede moverla o quitarla según sea necesario.
            this.produktuakTableAdapter.Fill(this.txispakDataSet.Produktuak);
            // TODO: esta línea de código carga datos en la tabla 'txispakDataSet.Bezeroak' Puede moverla o quitarla según sea necesario.
            this.bezeroakTableAdapter.Fill(this.txispakDataSet.Bezeroak);

            


        }

        private void button1_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Hide();
            FormBezeroak fp = new FormBezeroak();
            fp.Show();
        }

        private void bot_produktuak_Click(object sender, EventArgs e)
        {
            this.Hide();
            FormProduktuak fp = new FormProduktuak();
            fp.Show();
        }

        private void bot_salmentak_Click(object sender, EventArgs e)
        {
            this.Hide();
            FormSalmentak fp = new FormSalmentak();
            fp.Show();
        }
    }
}
