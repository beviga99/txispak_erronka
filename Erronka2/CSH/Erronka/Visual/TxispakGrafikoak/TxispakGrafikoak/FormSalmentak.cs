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
    public partial class FormSalmentak : Form
    {
        public FormSalmentak()
        {
            InitializeComponent();
            this.label3.Text = this.salmentakTableAdapter.ScalarQuery1().ToString() + " €";
            this.CenterToScreen();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
            Form1 form1 = new Form1();
            form1.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
