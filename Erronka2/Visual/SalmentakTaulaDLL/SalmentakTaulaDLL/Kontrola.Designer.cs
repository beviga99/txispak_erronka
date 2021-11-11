
namespace SalmentakTaulaDLL
{
    partial class Kontrola
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
            this.txispakDataSet = new SalmentakTaulaDLL.TxispakDataSet();
            this.bezeroakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.bezeroakTableAdapter = new SalmentakTaulaDLL.TxispakDataSetTableAdapters.BezeroakTableAdapter();
            this.produktuakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.produktuakTableAdapter = new SalmentakTaulaDLL.TxispakDataSetTableAdapters.ProduktuakTableAdapter();
            this.salmentakTableAdapter = new SalmentakTaulaDLL.TxispakDataSetTableAdapters.SalmentakTableAdapter();
            this.salmentakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.idDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.clientNameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.productNameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.productqtyDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.totalpriceDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.idDataGridViewTextBoxColumn,
            this.clientNameDataGridViewTextBoxColumn,
            this.productNameDataGridViewTextBoxColumn,
            this.productqtyDataGridViewTextBoxColumn,
            this.totalpriceDataGridViewTextBoxColumn});
            this.dataGridView1.DataSource = this.salmentakBindingSource;
            this.dataGridView1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridView1.Location = new System.Drawing.Point(0, 0);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(597, 216);
            this.dataGridView1.TabIndex = 0;
            // 
            // txispakDataSet
            // 
            this.txispakDataSet.DataSetName = "TxispakDataSet";
            this.txispakDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // bezeroakBindingSource
            // 
            this.bezeroakBindingSource.DataMember = "Bezeroak";
            this.bezeroakBindingSource.DataSource = this.txispakDataSet;
            // 
            // bezeroakTableAdapter
            // 
            this.bezeroakTableAdapter.ClearBeforeFill = true;
            // 
            // produktuakBindingSource
            // 
            this.produktuakBindingSource.DataMember = "Produktuak";
            this.produktuakBindingSource.DataSource = this.txispakDataSet;
            // 
            // produktuakTableAdapter
            // 
            this.produktuakTableAdapter.ClearBeforeFill = true;
            // 
            // salmentakTableAdapter
            // 
            this.salmentakTableAdapter.ClearBeforeFill = true;
            // 
            // salmentakBindingSource
            // 
            this.salmentakBindingSource.DataMember = "Salmentak";
            this.salmentakBindingSource.DataSource = this.txispakDataSet;
            // 
            // idDataGridViewTextBoxColumn
            // 
            this.idDataGridViewTextBoxColumn.DataPropertyName = "id";
            this.idDataGridViewTextBoxColumn.HeaderText = "id";
            this.idDataGridViewTextBoxColumn.Name = "idDataGridViewTextBoxColumn";
            // 
            // clientNameDataGridViewTextBoxColumn
            // 
            this.clientNameDataGridViewTextBoxColumn.DataPropertyName = "Client_Name";
            this.clientNameDataGridViewTextBoxColumn.HeaderText = "Client_Name";
            this.clientNameDataGridViewTextBoxColumn.Name = "clientNameDataGridViewTextBoxColumn";
            // 
            // productNameDataGridViewTextBoxColumn
            // 
            this.productNameDataGridViewTextBoxColumn.DataPropertyName = "Product_Name";
            this.productNameDataGridViewTextBoxColumn.HeaderText = "Product_Name";
            this.productNameDataGridViewTextBoxColumn.Name = "productNameDataGridViewTextBoxColumn";
            // 
            // productqtyDataGridViewTextBoxColumn
            // 
            this.productqtyDataGridViewTextBoxColumn.DataPropertyName = "product_qty";
            this.productqtyDataGridViewTextBoxColumn.HeaderText = "product_qty";
            this.productqtyDataGridViewTextBoxColumn.Name = "productqtyDataGridViewTextBoxColumn";
            // 
            // totalpriceDataGridViewTextBoxColumn
            // 
            this.totalpriceDataGridViewTextBoxColumn.DataPropertyName = "total_price";
            this.totalpriceDataGridViewTextBoxColumn.HeaderText = "total_price";
            this.totalpriceDataGridViewTextBoxColumn.Name = "totalpriceDataGridViewTextBoxColumn";
            // 
            // Kontrola
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.dataGridView1);
            this.Name = "Kontrola";
            this.Size = new System.Drawing.Size(597, 216);
            this.Load += new System.EventHandler(this.Kontrola_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private TxispakDataSet txispakDataSet;
        private System.Windows.Forms.BindingSource bezeroakBindingSource;
        private TxispakDataSetTableAdapters.BezeroakTableAdapter bezeroakTableAdapter;
        private System.Windows.Forms.BindingSource produktuakBindingSource;
        private TxispakDataSetTableAdapters.ProduktuakTableAdapter produktuakTableAdapter;
        private TxispakDataSetTableAdapters.SalmentakTableAdapter salmentakTableAdapter;
        private System.Windows.Forms.BindingSource salmentakBindingSource;
        private System.Windows.Forms.DataGridViewTextBoxColumn idDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn clientNameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn productNameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn productqtyDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn totalpriceDataGridViewTextBoxColumn;
    }
}
