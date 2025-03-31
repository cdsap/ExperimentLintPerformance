package com.performance.module_3_269

class Feature269UseCase2(
    private val repository: Feature269Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
