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
    public partial class FormProduktuak : Form
    {
        public FormProduktuak()
        {
            InitializeComponent();
        }

        private void FormProduktuak_Load(object sender, EventArgs e)
        {

            this.CenterToScreen();
            this.produktuakTableAdapter.Fill(this.txispakDataSet.Produktuak);

            this.label2.Text = this.produktuakTableAdapter.ScalarQuery().ToString();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
            Form1 form1 = new Form1();
            form1.Show();
        }
    }
}
