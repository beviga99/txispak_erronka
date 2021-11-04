
namespace TxispaKDLL
{
    partial class Control
    {
        /// <summary> 
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de componentes

        /// <summary> 
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.txispakDataSet = new TxispaKDLL.txispakDataSet();
            this.txispakDataSetBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.bezeroakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.bezeroakTableAdapter = new TxispaKDLL.txispakDataSetTableAdapters.BezeroakTableAdapter();
            this.produktuakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.produktuakTableAdapter = new TxispaKDLL.txispakDataSetTableAdapters.ProduktuakTableAdapter();
            this.salmentakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.salmentakTableAdapter = new TxispaKDLL.txispakDataSetTableAdapters.SalmentakTableAdapter();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSetBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.AllowUserToAddRows = false;
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.DataSource = this.txispakDataSetBindingSource;
            this.dataGridView1.Location = new System.Drawing.Point(146, 65);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(240, 150);
            this.dataGridView1.TabIndex = 0;
            this.dataGridView1.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            // 
            // txispakDataSet
            // 
            this.txispakDataSet.DataSetName = "txispakDataSet";
            this.txispakDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // txispakDataSetBindingSource
            // 
            this.txispakDataSetBindingSource.DataSource = this.txispakDataSet;
            this.txispakDataSetBindingSource.Position = 0;
            // 
            // bezeroakBindingSource
            // 
            this.bezeroakBindingSource.DataMember = "Bezeroak";
            this.bezeroakBindingSource.DataSource = this.txispakDataSetBindingSource;
            // 
            // bezeroakTableAdapter
            // 
            this.bezeroakTableAdapter.ClearBeforeFill = true;
            // 
            // produktuakBindingSource
            // 
            this.produktuakBindingSource.DataMember = "Produktuak";
            this.produktuakBindingSource.DataSource = this.txispakDataSetBindingSource;
            // 
            // produktuakTableAdapter
            // 
            this.produktuakTableAdapter.ClearBeforeFill = true;
            // 
            // salmentakBindingSource
            // 
            this.salmentakBindingSource.DataMember = "Salmentak";
            this.salmentakBindingSource.DataSource = this.txispakDataSetBindingSource;
            // 
            // salmentakTableAdapter
            // 
            this.salmentakTableAdapter.ClearBeforeFill = true;
            // 
            // Control
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.dataGridView1);
            this.Name = "Control";
            this.Size = new System.Drawing.Size(657, 429);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSetBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.BindingSource salmentakBindingSource;
        private System.Windows.Forms.BindingSource txispakDataSetBindingSource;
        private txispakDataSet txispakDataSet;
        private System.Windows.Forms.BindingSource bezeroakBindingSource;
        private txispakDataSetTableAdapters.BezeroakTableAdapter bezeroakTableAdapter;
        private System.Windows.Forms.BindingSource produktuakBindingSource;
        private txispakDataSetTableAdapters.ProduktuakTableAdapter produktuakTableAdapter;
        private txispakDataSetTableAdapters.SalmentakTableAdapter salmentakTableAdapter;
    }
}
