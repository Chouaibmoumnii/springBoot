module.exports = mongoose => {
    var schema = mongoose.Schema(
        {
            id: { type: Number, required: true },
            classe: { type: String, required: true },
            groupe: { type: String, required: true },
            date: { type: Date, required: true }
        },
        { timestamps: true }
    );

    schema.method("toJSON", function() {
        const { __v, _id, ...object } = this.toObject();
        object.id = _id;
        return object;
    });

    const Inscription = mongoose.model("inscription", schema);
    return Inscription;
};
