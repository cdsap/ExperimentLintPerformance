package com.performance.module_3_266

class Feature266UseCase0(
    private val repository: Feature266Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
