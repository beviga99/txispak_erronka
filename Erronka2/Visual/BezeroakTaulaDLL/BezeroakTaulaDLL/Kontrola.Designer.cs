
namespace BezeroakTaulaDLL
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
            this.bezeroakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.txispakDataSet1 = new BezeroakTaulaDLL.TxispakDataSet1();
            this.bezeroakTableAdapter = new BezeroakTaulaDLL.TxispakDataSet1TableAdapters.BezeroakTableAdapter();
            this.salmentakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.salmentakTableAdapter = new BezeroakTaulaDLL.TxispakDataSet1TableAdapters.SalmentakTableAdapter();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.txispakDataSet11 = new BezeroakTaulaDLL.TxispakDataSet1();
            this.bezeroakBindingSource1 = new System.Windows.Forms.BindingSource(this.components);
            this.idDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.clientNameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet11)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource1)).BeginInit();
            this.SuspendLayout();
            // 
            // bezeroakBindingSource
            // 
            this.bezeroakBindingSource.DataMember = "Bezeroak";
            this.bezeroakBindingSource.DataSource = this.txispakDataSet1;
            // 
            // txispakDataSet1
            // 
            this.txispakDataSet1.DataSetName = "TxispakDataSet1";
            this.txispakDataSet1.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // bezeroakTableAdapter
            // 
            this.bezeroakTableAdapter.ClearBeforeFill = true;
            // 
            // salmentakBindingSource
            // 
            this.salmentakBindingSource.DataMember = "Salmentak";
            this.salmentakBindingSource.DataSource = this.txispakDataSet1;
            // 
            // salmentakTableAdapter
            // 
            this.salmentakTableAdapter.ClearBeforeFill = true;
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.idDataGridViewTextBoxColumn,
            this.clientNameDataGridViewTextBoxColumn});
            this.dataGridView1.DataSource = this.bezeroakBindingSource;
            this.dataGridView1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridView1.Location = new System.Drawing.Point(0, 0);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(394, 240);
            this.dataGridView1.TabIndex = 0;
            // 
            // txispakDataSet11
            // 
            this.txispakDataSet11.DataSetName = "TxispakDataSet1";
            this.txispakDataSet11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // bezeroakBindingSource1
            // 
            this.bezeroakBindingSource1.DataMember = "Bezeroak";
            this.bezeroakBindingSource1.DataSource = this.txispakDataSet11;
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
            // Kontrola
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.dataGridView1);
            this.Name = "Kontrola";
            this.Size = new System.Drawing.Size(394, 240);
            this.Load += new System.EventHandler(this.Kontrola_Load);
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet11)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.BindingSource bezeroakBindingSource;
        private TxispakDataSet1 txispakDataSet1;
        private TxispakDataSet1TableAdapters.BezeroakTableAdapter bezeroakTableAdapter;
        private System.Windows.Forms.BindingSource salmentakBindingSource;
        private TxispakDataSet1TableAdapters.SalmentakTableAdapter salmentakTableAdapter;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.DataGridViewTextBoxColumn idDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn clientNameDataGridViewTextBoxColumn;
        private TxispakDataSet1 txispakDataSet11;
        private System.Windows.Forms.BindingSource bezeroakBindingSource1;
    }
}
