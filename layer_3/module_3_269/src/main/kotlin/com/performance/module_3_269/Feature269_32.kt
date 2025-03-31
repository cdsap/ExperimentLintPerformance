package com.performance.module_3_269

class Feature269UseCase0(
    private val repository: Feature269Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
