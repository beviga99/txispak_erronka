using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AGINTEPRO
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // TODO: esta línea de código carga datos en la tabla 'txpDataSet.Bezeroak' Puede moverla o quitarla según sea necesario.
            this.bezeroakTableAdapter.FillBy(this.txpDataSet.Bezeroak);
            chart1.DataSource = this.txpDataSet.Bezeroak
                .GroupBy(b => b.Client_Name)
                .ToDictionary(g => g.Key, g => g.Count());
            chart1.Series[0].YValueMembers = "Value";
            chart1.Series[0].XValueMember = "Key";
            chart1.DataBind();
        }

        private void fillByToolStripButton_Click(object sender, EventArgs e)
        {
            try
            {
                this.bezeroakTableAdapter.FillBy(this.txpDataSet.Bezeroak);
            }
            catch (System.Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }

        }
    }
}

