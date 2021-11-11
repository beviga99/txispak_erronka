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
    public partial class FormBezeroak : Form
    {
        public FormBezeroak()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void FormProduktuak_Load(object sender, EventArgs e)
        {
            this.CenterToScreen();
            this.salmentakTableAdapter.Fill(this.txispakDataSet.Salmentak);

            this.label1.Text = this.salmentakTableAdapter.ScalarQuery().ToString();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
            Form1 form1 = new Form1();
            form1.Show();
        }
    }
}
