using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SalmentakTaulaDLL
{
    public partial class Kontrola : UserControl
    {
        public Kontrola()
        {
            InitializeComponent();

        }

        private void Kontrola_Load(object sender, EventArgs e)
        {
            this.salmentakTableAdapter.Fill(this.txispakDataSet.Salmentak);
        }

        private void fillToolStripButton_Click(object sender, EventArgs e)
        {
            try
            {
                this.salmentakTableAdapter.Fill(this.txispakDataSet.Salmentak);
            }
            catch (System.Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }

        }
    }
}
